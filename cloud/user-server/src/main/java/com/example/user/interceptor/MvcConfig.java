package com.example.user.interceptor;


import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Title: MvcConfig.java
 * @Author: HSL
 * @Date: 2023/12/14 21:55
 * @Description:
 */

//注册拦截器
@Configuration
@ConditionalOnClass(DispatcherServlet.class)  //条件注入
public class MvcConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new UserInterceptor());
    }
}
