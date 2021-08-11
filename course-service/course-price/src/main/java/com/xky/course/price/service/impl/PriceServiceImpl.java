package com.xky.course.price.service.impl;

import com.xky.course.list.entity.Course;
import com.xky.course.price.client.CourseListClient;
import com.xky.course.price.entry.CourseAndPrice;
import com.xky.course.price.entry.Price;
import com.xky.course.price.mapper.PriceMapper;
import com.xky.course.price.service.PriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiekongying
 * @version 1.0
 * @date 2021/8/10 11:39 上午
 */
@Service
public class PriceServiceImpl implements PriceService {
    @Autowired
    private PriceMapper priceMapper;

    @Autowired
    private CourseListClient courseListClient;

    @Override
    public Price price(Integer courseId) {
        return priceMapper.price(courseId);
    }

    @Override
    public List<CourseAndPrice> courseAndPrices() {
        List<Course> list = courseListClient.list();
        List<CourseAndPrice> courseAndPricesList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Course course = list.get(i);
            Price price = price(course.getCourseId());
            CourseAndPrice courseAndPrice = new CourseAndPrice();
            courseAndPrice.setId(course.getId());
            courseAndPrice.setCourseId(course.getCourseId());
            courseAndPrice.setCourseName(course.getCourseName());
            courseAndPrice.setPrice(price.getPrice());
            courseAndPricesList.add(courseAndPrice);
        }
        return courseAndPricesList;
    }

}
