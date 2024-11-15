package com.lyyang.test.web.strategy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CustomStrategy implements MyStrategy {
    @Override
    public String execute() {
        log.info("Executing default strategy.");
        return "BBBB";
    }
}