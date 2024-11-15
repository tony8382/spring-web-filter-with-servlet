package com.lyyang.test.web.filter;

import com.lyyang.test.web.strategy.MyStrategy;
import lombok.extern.slf4j.Slf4j;

import javax.servlet.*;
import java.io.IOException;

@Slf4j
public class TestFilter implements Filter {
    private MyStrategy test;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.test = (MyStrategy) filterConfig.getServletContext().getAttribute("myCustomStrategy");
        log.info("G:{}", filterConfig.getServletContext().getAttributeNames().toString());
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        log.info("hello:{}", test.execute());
        filterChain.doFilter(servletRequest, servletResponse);
    }
}
