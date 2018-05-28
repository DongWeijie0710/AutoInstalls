package com.land.mine.fight.rabbitmq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @task:  SpringBoot默认实现MQ 项目启动后开始测试
 * @discrption:
 * @author: dongweijie
 * @date: 2018/5/28
 * @version: 1.0.0
 */

@Component
@Service
public class RabbitMqHelloTest implements ApplicationRunner {

    @Autowired
    private HelloSender helloSender;

    public void run(ApplicationArguments var1) throws Exception {
        System.out.println("项目启动完成，开启消息队列测试模式");
        helloSender.send();
    }
}
