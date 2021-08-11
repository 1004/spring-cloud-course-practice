package com.xky.course.price.mapper;

import com.xky.course.price.entry.Price;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface PriceMapper {
    @Select("SELECT * FROM price WHERE course_id=#{courseId}")
    public Price price(Integer courseId);
}
