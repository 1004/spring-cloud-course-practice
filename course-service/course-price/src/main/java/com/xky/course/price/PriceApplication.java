package com.xky.course.price;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author xiekongying
 * @version 1.0
 * @date 2021/8/10 11:33 上午
 */
@SpringBootApplication
@EnableFeignClients //服务间调用
@EnableCircuitBreaker //熔断
public class PriceApplication {
    public static void main(String[] args) {
        SpringApplication.run(PriceApplication.class, args);
    }
}
