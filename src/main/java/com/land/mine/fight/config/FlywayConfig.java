package com.land.mine.fight.config;

import org.flywaydb.core.Flyway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

/**
 * @task: flyway配置
 * @discrption:
 * @author: dongweijie
 * @date: 2018/5/24
 * @version: 1.0.0
 */

@Configuration
public class FlywayConfig {

    @Autowired
    private Flyway flyway;

    @PostConstruct
    public void init() {
        flyway.repair();
        flyway.info();
        flyway.migrate();
    }

}
