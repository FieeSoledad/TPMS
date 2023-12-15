package com.huadi.project.tpms.config;

import com.huadi.project.tpms.interceptor.LoginInterceptor;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.annotation.Resource;

/**
 * Web MVC 配置类
 * @author pan_junbiao
 **/
@Configuration
@ComponentScan("com.huadi.project.tpms.interceptor")
public class WebMvcConfig implements WebMvcConfigurer
{
    @Resource
    private LoginInterceptor loginInterceptor;
    /**
     * 拦截器注册
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry)
    {
        registry.addInterceptor(loginInterceptor).addPathPatterns("/**").excludePathPatterns("/**/*.js",
                "/**/*.css","/login","/image/**","/verify/login");
    }
}