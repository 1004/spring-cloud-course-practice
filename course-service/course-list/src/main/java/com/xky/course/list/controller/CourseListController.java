package com.xky.course.list.controller;

import com.xky.course.list.entity.Course;
import com.xky.course.list.service.CourseListSerevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author xiekongying
 * @version 1.0
 * @date 2021/8/10 10:59 上午
 */
@RestController
@RequestMapping("/course")
public class CourseListController {
    @Autowired
    private CourseListSerevice courseListSerevice;

    @GetMapping("/list")
    public List<Course> list() {
        return courseListSerevice.list();
    }
}
