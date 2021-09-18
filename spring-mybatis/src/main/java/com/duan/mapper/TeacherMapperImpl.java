package com.duan.mapper;

import com.duan.pojo.Teacher;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TeacherMapperImpl extends SqlSessionDaoSupport implements TeacherMapper {
    @Override
    public List<Teacher> getTeacher() {
        return getSqlSession().getMapper(TeacherMapper.class).getTeacher();
    }

    @Override
    public Teacher getTeacher(int id) {
        return getSqlSession().getMapper(TeacherMapper.class).getTeacher(id);
    }

    @Override
    @Transactional
    public Teacher getTeacher2(int id) {
        return getSqlSession().getMapper(TeacherMapper.class).getTeacher2(id);
    }

    @Override
    public Teacher getTeacherIf(Integer id, String name) {
        return getSqlSession().getMapper(TeacherMapper.class).getTeacherIf(id, name);
    }
}
