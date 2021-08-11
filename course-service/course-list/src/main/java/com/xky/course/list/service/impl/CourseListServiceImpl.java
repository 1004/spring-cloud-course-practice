package com.xky.course.list.service.impl;

import com.xky.course.list.entity.Course;
import com.xky.course.list.mapper.CourseListMapper;
import com.xky.course.list.service.CourseListSerevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author xiekongying
 * @version 1.0
 * @date 2021/8/10 11:06 上午
 */
@Service
public class CourseListServiceImpl implements CourseListSerevice {

    @Autowired
    private CourseListMapper courseListMapper;

    @Override
    public List<Course> list(){
        return courseListMapper.list();
    }
}
