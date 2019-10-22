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
public class ShapeFactory {

    public Shape getShape(String type) {
        if ("圆".equals(type)) {
            return new Circle();
        } else if ("三角".equals(type)) {
            return new Triangle();
        }
        return null;
    }
}
