package com.xky.course.list.mapper;

import com.xky.course.list.entity.Course;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface CourseListMapper {

    @Select("SELECT * FROM course WHERE valid=1")
    public List<Course> list();
}
