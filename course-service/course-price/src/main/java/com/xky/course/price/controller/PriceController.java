package com.xky.course.price.controller;

import com.xky.course.list.entity.Course;
import com.xky.course.price.client.CourseListClient;
import com.xky.course.price.entry.CourseAndPrice;
import com.xky.course.price.entry.Price;
import com.xky.course.price.service.PriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author xiekongying
 * @version 1.0
 * @date 2021/8/10 11:37 上午
 */
@RestController
@RequestMapping("/course")
public class PriceController {

    @Autowired
    private PriceService priceService;

    @Autowired
    private CourseListClient courseListClient;

    @GetMapping("/price")
    public Price price(@RequestParam Integer courseId){
        return priceService.price(courseId);
    }

    @GetMapping("/listInPrice")
    public List<Course> listCourse(){
        return courseListClient.list();
    }

    @GetMapping("/courseAndPrice")
    public List<CourseAndPrice> courseAndPrices(){
        return priceService.courseAndPrices();
    }


}
