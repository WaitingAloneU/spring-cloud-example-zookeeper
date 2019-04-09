package com.example.gateway.filter;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;


@Slf4j
public class TokenFilter {
    /*@Override
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
        String token = request.getParameter("token");
        log.info("TokenFilter------->{}", token);
        if(StringUtils.isEmpty(token)){
            context.setResponseStatusCode(401);
            context.setResponseBody("token valid");
            context.set("isSuccess", false);
        } else {
            // 验证token成功
            context.setSendZuulResponse(true); //对请求进行路由
            context.setResponseStatusCode(200);
            context.set("isSuccess", true);
        }
        return null;
    }*/
}
