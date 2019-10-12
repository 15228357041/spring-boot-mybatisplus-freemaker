package cn.chinau8.config;

import cn.chinau8.interceptor.CommonInterceptor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * 注册拦截器
 * @Author yehao.
 * @Date 2017/4/10  23:24.
 */
@Configuration
public class MyWebAppConfigurer extends WebMvcConfigurerAdapter {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        // 多个拦截器组成一个拦截器链

        // addPathPatterns 用于添加拦截规则

        // excludePathPatterns 用户排除拦截

        registry.addInterceptor(new CommonInterceptor()).addPathPatterns("/**");
        //registry.addInterceptor(new OtherInterceptor()).addPathPatterns("/**");
        //registry.addInterceptor(new LoginInterceptor()).excludePathPatterns("/index.html").excludePathPatterns("/mt/index.html").excludePathPatterns("/login**").addPathPatterns("/**");
        super.addInterceptors(registry);

    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("forward:/index.html");
        registry.setOrder(Ordered.HIGHEST_PRECEDENCE);
        super.addViewControllers(registry);
    }
}
