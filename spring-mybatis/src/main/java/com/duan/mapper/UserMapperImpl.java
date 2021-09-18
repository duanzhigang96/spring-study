package com.duan.mapper;

import com.duan.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;
import java.util.Map;

public class UserMapperImpl implements UserMapper{

    private SqlSessionTemplate sessionTemplate;

    public SqlSessionTemplate getSessionTemplate() {
        return sessionTemplate;
    }

    public void setSessionTemplate(SqlSessionTemplate sessionTemplate) {
        this.sessionTemplate = sessionTemplate;
    }

    @Override
    public List<User> selectUser() {
        return (List<User>) sessionTemplate.getMapper(UserMapper.class).selectUser();
    }

    @Override
    public void addUser(User user) {

    }

    @Override
    public void addUser2(Map<String, Object> user) {

    }

    @Override
    public void deleteUser(int id) {

    }

    @Override
    public List<User> getUserLike(String name) {
        return null;
    }

    @Override
    public List<User> selectAll(Map<String, Integer> user) {
        return null;
    }
}
