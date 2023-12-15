package com.huadi.project.tpms.aop;

import com.huadi.project.tpms.utils.result.DataResult;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpSession;

@Component
@Aspect
public class AroundAop {
    public static final String POINT_CUT = "execution(* com.huadi.project.tpms.controller.ClassesController.*(..)) || " +
            "execution(* com.huadi.project.tpms.controller.ClassesController.*(..))";



    @Around(AroundAop.POINT_CUT)
    public DataResult checkSession(ProceedingJoinPoint pjp) throws Throwable {
        //获取session
//        HttpSession session = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest().getSession();
        return (DataResult) pjp.proceed();
    }

}
