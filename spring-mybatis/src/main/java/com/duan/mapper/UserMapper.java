package com.duan.mapper;

import com.duan.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    public List<User> selectUser();

    public void addUser(User user);

    public void addUser2(Map<String,Object> user);

    public void deleteUser(int id);

    public List<User> getUserLike(String name);

    public List<User> selectAll(Map<String, Integer> user);

    public List<User> getUser();

    public List<User> getUser2();
}
