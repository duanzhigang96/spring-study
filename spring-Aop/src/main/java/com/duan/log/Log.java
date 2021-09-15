package com.duan.log;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;
//方式一
public class Log implements MethodBeforeAdvice {

    //method:要执行的目标对象方法
    //objects:参数
    //target:目标对象
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println(o.getClass().getName() + " " + method.getName());
    }
}
