package com.example.gateway.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.redis.core.StringRedisTemplate;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * uri访问统计, 用redis的increment来记录访问次数, 只记录非200的请求
 */
@Slf4j
public class StatisticsFilter extends ZuulFilter {

    @Resource
    private StringRedisTemplate stringRedisTemplate;

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext context = RequestContext.getCurrentContext();
        HttpServletRequest request = context.getRequest();
        String uri = request.getRequestURI();
        log.info("uri--->{}", uri);
        HttpServletResponse response = context.getResponse();
        int status = response.getStatus();
        if(status != 200) {
            stringRedisTemplate.opsForHash().increment("uri_statistics_success_" + status, uri, 1);
        }
        return null;
    }
}
