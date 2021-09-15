package com.duan.log;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;
//方式一
public class AfterLog implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println(o1.getClass().getName() + " " + method.getName());
    }
}
