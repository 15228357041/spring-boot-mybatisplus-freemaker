package cn.chinau8.task;


import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * 测试定时任务(演示Demo，可删除)
 * 
 * testTask为spring bean的名称
 * 
 * @author xuchangda
 * @email changdaxu@foxmail.com
 * @date 2016年11月30日 下午1:34:24
 */
@Component("testTask")
public class TestTask implements Job {
	private Logger logger = LoggerFactory.getLogger(getClass());

	@Override
	public void execute(JobExecutionContext context)
			throws JobExecutionException {
		System.out.print("hello");
		logger.info("我是不带参数的test2方法，正在被执行");

	}

	public void test(String params){
		logger.info("我是带参数的test方法，正在被执行，参数为：" + params);
		
		try {
			Thread.sleep(1000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
//		SysUserEntity user = sysUserService.queryObject(1L);
//		System.out.println(ToStringBuilder.reflectionToString(user));
		
	}
	
//	@Scheduled(cron = " */5 * * * * ? ")
	public void test2(){
		System.out.print("hello");
		logger.info("我是不带参数的test2方法，正在被执行");
	}
}
