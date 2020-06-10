package cn.chinau8.util.schedule;




import cn.chinau8.entity.ScheduleJob;
import cn.chinau8.entity.ScheduleJobLog;
import cn.chinau8.service.IScheduleJobLogService;
import cn.chinau8.util.SpringContextUtil;
import org.apache.commons.lang3.StringUtils;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.quartz.QuartzJobBean;

import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

//import io.renren.common.utils.SpringContextUtils;
//import io.renren.modules.job.entity.ScheduleJobEntity;
//import io.renren.modules.job.entity.ScheduleJobLogEntity;
//import io.renren.modules.job.service.ScheduleJobLogService;
//import org.apache.commons.lang.StringUtils;
//import java.util.Date;


/**
 * 定时任务
 * 
 * @author xuchangda
 * @email changdaxu@foxmail.com
 * @date 2016年11月30日 下午12:44:21
 */
public class ScheduleJobWork extends QuartzJobBean {
	private Logger logger = LoggerFactory.getLogger(getClass());
	private ExecutorService service = Executors.newSingleThreadExecutor(); 
	
    @Override
    protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
        ScheduleJob scheduleJob = (ScheduleJob) context.getMergedJobDataMap()
        		.get(ScheduleJob.JOB_PARAM_KEY);


        //插入执行日志
        //获取spring bean
		IScheduleJobLogService scheduleJobLogService = (IScheduleJobLogService) SpringContextUtil.getBean("scheduleJobLogServiceImpl");

        //数据库保存执行记录
        ScheduleJobLog log = new ScheduleJobLog();
        log.setJobId(scheduleJob.getId());
        log.setBeanName(scheduleJob.getJobBeanName());
        log.setMethodName(scheduleJob.getJobMethodName());
        log.setParams(scheduleJob.getJobParams());
        log.setCreateTime(new Date());
        
        //任务开始时间
        long startTime = System.currentTimeMillis();
        
        try {
            //执行任务
        	logger.info("任务准备执行，任务ID：" + scheduleJob.getId());
            ScheduleRunnable task = new ScheduleRunnable(scheduleJob.getJobBeanName(),
            		scheduleJob.getJobMethodName(), scheduleJob.getJobParams());
            Future<?> future = service.submit(task);
            
			future.get();
			
			//任务执行总时长
			long times = System.currentTimeMillis() - startTime;

			log.setTimes((int)times);
			//任务状态    1：成功    0：失败
			log.setStatus(1);
			
			logger.info("任务执行完毕，任务ID：" + scheduleJob.getId() + "  总共耗时：" + times + "毫秒");
		} catch (Exception e) {
			logger.error("任务执行失败，任务ID：" + scheduleJob.getId(), e);
			
			//任务执行总时长
			long times = System.currentTimeMillis() - startTime;
			log.setTimes((int)times);
			
			//任务状态    1：成功    0：失败
			log.setStatus(0);
			log.setError(StringUtils.substring(e.toString(), 0, 2000));
		}finally {
			scheduleJobLogService.insert(log);
		}
    }
}
