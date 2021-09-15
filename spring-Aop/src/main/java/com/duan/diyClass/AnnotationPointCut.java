package com.duan.diyClass;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

//使用注解方式实现aop
@Aspect//标注这个类是一个切面
public class AnnotationPointCut {
    @Before("execution(* com.duan.service.UserServiceImpl.*(..))")
    public void before(){
        System.out.println("method exec before");
    }
    @After("execution(* com.duan.service.UserServiceImpl.*(..))")
    public void after(){
        System.out.println("method exec after");
    }
    @Around("execution(* com.duan.service.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint point) throws Throwable {
        System.out.println("method exec around 111");
        point.proceed();
        System.out.println("method exec around 222");
    }
}
