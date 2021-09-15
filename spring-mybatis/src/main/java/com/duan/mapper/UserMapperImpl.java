package com.duan.mapper;

import com.duan.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

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
}
