package com.xky.course.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author xiekongying
 * @version 1.0
 * @date 2021/8/11 12:00 下午
 */
@SpringCloudApplication
@EnableZuulProxy
public class CourseZuulApplication {
    public static void main(String[] args) {
        SpringApplication.run(CourseZuulApplication.class,args);
    }
}
