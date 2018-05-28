package com.land.mine.fight.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



/**
 * @task: RabbitMQ配置
 * @discrption:
 * @author: dongweijie
 * @date: 2018/5/28
 * @version: 1.0.0
 */
@Configuration
public class RabbitConfig {

    @Bean
    public Queue Queue() {
        return new Queue("hello");
    }

}