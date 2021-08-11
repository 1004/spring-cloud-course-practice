package com.xky.course.list.entity;

import java.io.Serializable;

/**
 * @author xiekongying
 * @version 1.0
 * @date 2021/8/10 11:04 上午
 */
public class Course  implements Serializable {
    private Integer id;
    private Integer courseId;
    private String courseName;
    private Integer valid;

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

    public Integer getValid() {
        return valid;
    }

    public void setValid(Integer valid) {
        this.valid = valid;
    }
}
