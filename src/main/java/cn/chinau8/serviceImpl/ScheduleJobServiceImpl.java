package cn.chinau8.serviceImpl;

import cn.chinau8.entity.ScheduleJob;
import cn.chinau8.mapper.ScheduleJobMapper;
import cn.chinau8.service.IScheduleJobService;
import cn.chinau8.util.schedule.ScheduleUtils;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.quartz.Scheduler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhuxufeng
 * @since 2020-06-10
 */
@Service
public class ScheduleJobServiceImpl extends ServiceImpl<ScheduleJobMapper, ScheduleJob> implements IScheduleJobService {
    @Autowired
    private ScheduleJobMapper scheduleJobMapper;
    @Autowired
    private Scheduler scheduler;

    @Override
    public void schedulerRun(String id) {
        ScheduleJob scheduleJob = scheduleJobMapper.selectById(id);
        ScheduleUtils.run(scheduler, scheduleJob);
    }

    @Override
    public void createScheduleJob(ScheduleJob scheduleJob) {
        scheduleJobMapper.insert(scheduleJob);
        ScheduleUtils.createScheduleJob(scheduler, scheduleJob);
    }

    @Override
    public void updateScheduleJob(ScheduleJob scheduleJob) {
        scheduleJobMapper.updateById(scheduleJob);
        ScheduleUtils.updateScheduleJob(scheduler, scheduleJob);
    }

    @Override
    public void deleteScheduleJob(String id) {
        scheduleJobMapper.deleteById(id);
        ScheduleUtils.deleteScheduleJob(scheduler, id);
    }
}
