package com.duan.mapper;

import com.duan.pojo.Teacher;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TeacherMapper {
    public List<Teacher> getTeacher();

    Teacher getTeacher(@Param("tid") int id);

    Teacher getTeacher2(@Param("tid") int id);

    Teacher getTeacherIf(@Param("id") Integer id, @Param("name") String name);

}
