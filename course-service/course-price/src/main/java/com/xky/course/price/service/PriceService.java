package com.xky.course.price.service;

import com.xky.course.price.entry.CourseAndPrice;
import com.xky.course.price.entry.Price;

import java.util.List;

public interface PriceService {

    Price price(Integer courseId);

    List<CourseAndPrice> courseAndPrices();
}
