package com.xky.course.price.client;

import com.xky.course.list.entity.Course;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

/**
 * @author xiekongying
 * @version 1.0
 * @date 2021/8/11 10:50 上午
 */
@Component
public class CourseListClientHystrix implements CourseListClient{
    @Override
    public List<Course> list() {
        return Collections.emptyList();
    }
}
