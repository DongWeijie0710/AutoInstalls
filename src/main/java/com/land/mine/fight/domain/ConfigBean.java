package com.land.mine.fight.domain;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @task:
 * @discrption:
 * @author: dongweijie
 * @date: 2018/6/6
 * @version: 1.0.0
 */

@Component
@Data
@ConfigurationProperties(prefix = "jackson")
public class ConfigBean {

    private  String name;
    private  String color;
    private String song;
}
