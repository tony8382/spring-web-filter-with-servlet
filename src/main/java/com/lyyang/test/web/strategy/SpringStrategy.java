package com.lyyang.test.web.strategy;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class SpringStrategy implements MyStrategy {
    @Override
    public String execute() {
        log.info("Executing spring strategy.");
        return "CCCCC";
    }
}