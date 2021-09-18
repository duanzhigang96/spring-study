package com.duan.mapper;

import com.duan.pojo.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;
import java.util.Map;

public class UserMapperImpl2 extends SqlSessionDaoSupport implements UserMapper {
    @Override
    public List<User> selectUser() {
        return getSqlSession().getMapper(UserMapper.class).selectUser();
    }

    @Override
    public void addUser(User user) {
        getSqlSession().getMapper(UserMapper.class).addUser(user);
    }

    @Override
    public void addUser2(Map<String, Object> user) {
        getSqlSession().getMapper(UserMapper.class).addUser2(user);
    }

    @Override
    public void deleteUser(int id) {
        getSqlSession().getMapper(UserMapper.class).deleteUser(id);
    }

    @Override
    public List<User> getUserLike(String name) {
        return getSqlSession().getMapper(UserMapper.class).getUserLike(name);
    }

    @Override
    public List<User> selectAll(Map<String, Integer> user) {
        return getSqlSession().getMapper(UserMapper.class).selectAll(user);
    }

    @Override
    public List<User> getUser() {
        return getSqlSession().getMapper(UserMapper.class).getUser();
    }

    @Override
    public List<User> getUser2() {
        return getSqlSession().getMapper(UserMapper.class).getUser2();
    }
}
