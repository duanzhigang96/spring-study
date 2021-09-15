package com.duan.demo04;


import com.duan.demo02.UserService;
import com.duan.demo02.UserServiceImpl;

public class Client {
    public static void main(String[] args) {
        //真实角色
        UserServiceImpl userService = new UserServiceImpl();
        //代理角色
        ProxyInvocationHandler handler = new ProxyInvocationHandler();
        handler.setTarget(userService);//设置代理对象
        //动态生成代理类
        UserService proxy = (UserService) handler.getProxy();
        proxy.query();
    }
}
