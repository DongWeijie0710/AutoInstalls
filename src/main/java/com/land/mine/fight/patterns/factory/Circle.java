package com.land.mine.fight.patterns.factory;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @task:
 * @discrption:
 * @author: dongweijie
 * @date: 2019/10/12
 * @version: 1.0.0
 */
@Service
@Slf4j
public class Circle implements Shape {

    @Override
    public void draw(){
        log.info("画圆");
    }
}
