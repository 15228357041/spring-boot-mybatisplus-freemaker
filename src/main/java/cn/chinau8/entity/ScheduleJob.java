package cn.chinau8.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;


/**
 * <p>
 * <p>
 * </p>
 *
 * @author zhuxufeng
 * @since 2020-01-14
 */
@TableName("schedule_job")
public class ScheduleJob extends Model<ScheduleJob> {

    private static final long serialVersionUID = 1L;
    /**
     * 任务调度参数key
     */
    public static final String JOB_PARAM_KEY = "JOB_PARAM_KEY";

    /**
     * 定时任务状态
     *
     * @author xuchangda
     * @email changdaxu@foxmail.com
     * @date 2016年12月3日 上午12:07:22
     */
    public enum ScheduleStatus {
        /**
         * 正常
         */
        NORMAL(true),
        /**
         * 暂停
         */
        PAUSE(false);

        private Boolean value;

        private ScheduleStatus(Boolean value) {
            this.value = value;
        }

        public Boolean getValue() {
            return value;
        }
    }

    private String id;
    @TableField("job_bean_name")
    private String jobBeanName;
    @TableField("job_method_name")
    private String jobMethodName;
    @TableField("job_params")
    private String jobParams;
    @TableField("job_cron_expression")
    private String jobCronExpression;
    @TableField("job_status")
    private Boolean jobStatus;
    @TableField("job_remark")
    private String jobRemark;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getJobBeanName() {
        return jobBeanName;
    }

    public void setJobBeanName(String jobBeanName) {
        this.jobBeanName = jobBeanName;
    }

    public String getJobMethodName() {
        return jobMethodName;
    }

    public void setJobMethodName(String jobMethodName) {
        this.jobMethodName = jobMethodName;
    }

    public String getJobParams() {
        return jobParams;
    }

    public void setJobParams(String jobParams) {
        this.jobParams = jobParams;
    }

    public String getJobCronExpression() {
        return jobCronExpression;
    }

    public void setJobCronExpression(String jobCronExpression) {
        this.jobCronExpression = jobCronExpression;
    }

    public Boolean getJobStatus() {
        return jobStatus;
    }

    public void setJobStatus(Boolean jobStatus) {
        this.jobStatus = jobStatus;
    }

    public String getJobRemark() {
        return jobRemark;
    }

    public void setJobRemark(String jobRemark) {
        this.jobRemark = jobRemark;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
