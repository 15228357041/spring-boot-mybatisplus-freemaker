package cn.chinau8.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Map;

/**
 * 资源文件读取工具
 *
 * @author test
 * @date 2016年10月15日
 */
@Component("springContextUtil")
public class SpringContextUtil implements ApplicationContextAware {


	private SpringContextUtil() {
		super();
	}

	private static ApplicationContext applicationContext; // Spring应用上下文环境

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		SpringContextUtil.applicationContext = applicationContext;
	}

	public static ApplicationContext getApplicationContext() {
		return applicationContext;
	}


	/**
	 * 根据名称获取bean
	 * @param beanName
	 * @return
	 */
	public static Object getBean(String beanName) {
		String[] beans = applicationContext.getBeanDefinitionNames();
		/*Arrays.sort(beans);
		for (String bean : beans)
		{
			System.out.println(bean + " of Type :: " + applicationContext.getBean(bean).getClass());
		}*/
		return applicationContext.getBean(beanName);
	}

	/**
	 * 根据bean名称获取指定类型bean
	 * @param beanName bean名称
	 * @param clazz 返回的bean类型,若类型不匹配,将抛出异常
	 */
	public static <T> T getBean(String beanName, Class<T> clazz) {
		return applicationContext.getBean(beanName, clazz);
	}
	/**
	 * 根据类型获取bean
	 * @param clazz
	 * @return
	 */
	public static <T> T getBean(Class<T> clazz) {
		T t = null;
		Map<String, T> map = applicationContext.getBeansOfType(clazz);
		for (Map.Entry<String, T> entry : map.entrySet()) {
			t = entry.getValue();
		}
		return t;
	}

	/**
	 * 是否包含bean
	 * @param beanName
	 * @return
	 */
	public static boolean containsBean(String beanName) {
		return applicationContext.containsBean(beanName);
	}

	/**
	 * 是否是单例
	 * @param beanName
	 * @return
	 */
	public static boolean isSingleton(String beanName) {
		return applicationContext.isSingleton(beanName);
	}

	/**
	 * bean的类型
	 * @param beanName
	 * @return
	 */
	public static Class getType(String beanName) {
		return applicationContext.getType(beanName);
	}

}
