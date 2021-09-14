package com.duan.demo02;

public class UserServiceProxy  implements UserService{

    private UserServiceImpl userService;

    public UserServiceImpl getUserService() {
        return userService;
    }

    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }

    @Override
    public void add() {
        userService.add();
    }

    @Override
    public void delete() {
        userService.add();
    }

    @Override
    public void update() {
        userService.add();
    }

    @Override
    public void query() {
        userService.add();
    }
}
