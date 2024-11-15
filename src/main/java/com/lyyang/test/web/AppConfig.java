package com.lyyang.test.web;


import com.lyyang.test.web.filter.TestFilter;
import com.lyyang.test.web.strategy.CustomStrategy;
import com.lyyang.test.web.strategy.MyStrategy;
import com.lyyang.test.web.strategy.SpringStrategy;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.WebApplicationContext;

import java.util.Objects;

@Slf4j
@RequiredArgsConstructor
@Configuration
public class AppConfig {

    @Bean
    public FilterRegistrationBean<TestFilter> myFilterRegistration(WebApplicationContext webApplicationContext, SpringStrategy springStrategy) {

        MyStrategy strategy = new CustomStrategy();
        Objects.requireNonNull(webApplicationContext.getServletContext()).setAttribute("myCustomStrategy", springStrategy);

        FilterRegistrationBean<TestFilter> registrationBean = new FilterRegistrationBean<>();
        registrationBean.setFilter(new TestFilter());
        registrationBean.addUrlPatterns("/*");
        registrationBean.setOrder(1);
        return registrationBean;
    }
}