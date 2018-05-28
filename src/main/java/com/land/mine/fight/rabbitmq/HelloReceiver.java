package com.land.mine.fight.rabbitmq;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @task: SpringBoot默认实现消费者
 * @discrption:
 * @author: dongweijie
 * @date: 2018/5/28
 * @version: 1.0.0
 */

@Component
@RabbitListener(queues = "hello")
public class HelloReceiver {

    @RabbitHandler
    public void process(String hello) {
        System.out.println("Receiver  : " + hello);
    }
}
