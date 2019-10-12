package cn.chinau8.util;

import org.springframework.beans.factory.annotation.Value;

import java.util.UUID;

/**
 * Created by Administrator on 2017/4/24.
 */
public class OrderUtil {
    @Value("${config.machineId}")
    private static Integer machineId;//最大支持1-9个集群机器部署  每台集群机器不一样

    public static String getOrderNo(){
        int hashCodeV = UUID.randomUUID().toString().hashCode();
        if(hashCodeV < 0) {//有可能是负数
            hashCodeV = - hashCodeV;
        }
        // 0 代表前面补充0
        // 4 代表长度为4
        // d 代表参数为正数型
        return machineId+String.format("%015d", hashCodeV);
    }



}
