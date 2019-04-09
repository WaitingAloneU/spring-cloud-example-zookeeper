package com.example.gateway.filter;

import com.example.gateway.service.OrderService;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Slf4j
public class TokenFilter extends ZuulFilter {

    @Resource
    private OrderService tokenService;

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return -1;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext context = RequestContext.getCurrentContext();
        HttpServletRequest request = context.getRequest();
        String token = request.getParameter("token");
        log.info("token->{}", token);
        if(StringUtils.isEmpty(token)){
            context.setResponseBody("token valid");
            context.set("isSuccess", false);
        } else {
            Boolean tokenResult = tokenService.authToken(token);
            log.info("tokenResult---->{}", tokenResult);
            context.set("isSuccess", tokenResult);
        }
        return null;
    }
}
