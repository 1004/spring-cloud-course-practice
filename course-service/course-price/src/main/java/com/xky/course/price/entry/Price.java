package com.xky.course.price.entry;

import java.io.Serializable;

/**
 * @author xiekongying
 * @version 1.0
 * @date 2021/8/10 11:36 上午
 */
public class Price implements Serializable {
    private Integer id;
    private Integer courseId;
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

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
