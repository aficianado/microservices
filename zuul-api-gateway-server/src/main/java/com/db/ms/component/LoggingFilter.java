package com.db.ms.component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

@Component
public class LoggingFilter extends ZuulFilter {

    private Logger log = LoggerFactory.getLogger(this.getClass());

    //pre, posst, error
    @Override
    public String filterType() {
        return "pre";
    }

    //multiple filters... then specify order
    @Override
    public int filterOrder() {
        return 1;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        HttpServletRequest request = RequestContext.getCurrentContext().getRequest();
        log.info("Request -> {} Request uri -> {}", request, request.getRequestURI());
        return null;
    }
}
