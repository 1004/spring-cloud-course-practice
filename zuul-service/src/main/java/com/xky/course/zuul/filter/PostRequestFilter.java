package com.xky.course.zuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;

/**
 * @author xiekongying
 * @version 1.0
 * @date 2021/8/11 2:29 下午
 */
@Component
public class PostRequestFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return FilterConstants.POST_TYPE;
    }

    @Override
    public int filterOrder() {
        return FilterConstants.SEND_RESPONSE_FILTER_ORDER - 1;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext currentContext = RequestContext.getCurrentContext();
        long time = (long) currentContext.get("time");
        long lastTime = System.currentTimeMillis() - time;
        String requestURI = currentContext.getRequest().getRequestURI();
        System.out.println(requestURI + "花费时间:" + lastTime);
        return null;
    }
}
