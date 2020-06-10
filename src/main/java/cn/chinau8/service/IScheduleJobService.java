package cn.chinau8.service;

import cn.chinau8.entity.ScheduleJob;
import com.baomidou.mybatisplus.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zhuxufeng
 * @since 2020-06-10
 */
public interface IScheduleJobService extends IService<ScheduleJob> {
    void schedulerRun(String id);

    void createScheduleJob(ScheduleJob scheduleJob);

    void updateScheduleJob(ScheduleJob scheduleJob);

    void deleteScheduleJob(String id);
}
