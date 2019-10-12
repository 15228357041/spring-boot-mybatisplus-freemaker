package cn.chinau8.generator;
import java.util.ResourceBundle;


import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.DbType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;


/**
 * @classname: GenerateHelper
 * @description: TODO
 * @author: zhuxufeng
 * @date: 2018/8/3 8:42
 * @version: 1.0
 **/
public class GenerateHelper {
    /**
     * <p>
     * 测试 run 执行
     * </p>
     * <p>
     * 更多使用查看 http://mp.baomidou.com
     * </p>
     */
    public static void main(String[] args) {

//用来获取Mybatis-Plus.properties文件的配置信息

        AutoGenerator mpg = new AutoGenerator();


// 全局配置
        GlobalConfig gc = new GlobalConfig();
        String basePath = GenerateHelper.class.getResource("/").getPath().replace("/target/classes/", "")+"/src/main/java";
        gc.setOutputDir(basePath);


        gc.setFileOverride(true);
        gc.setActiveRecord(true);// 开启 activeRecord 模式
        gc.setEnableCache(false);// XML 二级缓存
        gc.setBaseResultMap(true);// XML ResultMap
        gc.setBaseColumnList(false);// XML columList
        gc.setAuthor("zhuxufeng");
        mpg.setGlobalConfig(gc);


// 数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setDbType(DbType.MYSQL);
        dsc.setDriverName("com.mysql.jdbc.Driver");
        dsc.setUsername("mysql");
        dsc.setPassword("123456");
        dsc.setUrl("jdbc:mysql://52.83.171.94:3006/geely_20190114?useUnicode=true&characterEncoding=utf-8");
        mpg.setDataSource(dsc);


// 策略配置
        StrategyConfig strategy = new StrategyConfig();
//strategy.setTablePrefix(new String[] { "bmd_", "mp_" });// 此处可以修改为您的表前缀
        strategy.setNaming(NamingStrategy.underline_to_camel);// 表名生成策略
        strategy.setInclude(new String[] { "users"}); // 需要生成的表
// 字段名生成策略
        strategy.setFieldNaming(NamingStrategy.underline_to_camel);
        strategy.setSuperServiceImplClass("com.baomidou.mybatisplus.service.impl.ServiceImpl");
        mpg.setStrategy(strategy);


// 包配置
        PackageConfig pc = new PackageConfig();
// pc.setModuleName("test");
        pc.setParent("cn.chinau8");// 自定义包路径
        pc.setController("controller");// 这里是控制器包名，默认 web
        pc.setEntity("entity");
        pc.setMapper("mapper");
        pc.setXml("mapping");
        pc.setService("service");
        pc.setServiceImpl("serviceImpl");
        mpg.setPackageInfo(pc);
// 执行生成
        mpg.execute();
    }
}
