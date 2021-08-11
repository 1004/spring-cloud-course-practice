package com.xky.course.price.entry;

import java.io.Serializable;

/**
 * @author xiekongying
 * @version 1.0
 * @date 2021/8/11 11:31 上午
 */
public class CourseAndPrice implements Serializable {
    private Integer id;
    private Integer courseId;
    private String courseName;
    private Integer price;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
