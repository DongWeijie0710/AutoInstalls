package com.land.mine.fight.rabbitmq;


import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.QueueingConsumer;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

/**
 * @task: RabbitMQ消费者
 * @discrption:
 * @author: dongweijie
 * @date: 2018/5/28
 * @version: 1.0.0
 */
public class RabbitConsumer {

    private final static String QUEUE_NAME = "RabbitMQ_Hello";

    public static void main(String[] argv) throws IOException, InterruptedException,TimeoutException {

        ConnectionFactory factory = new ConnectionFactory(); //创建连接连接到RabbitMQ
        factory.setHost("127.0.0.1");// MQ的IP

//        127.0.0.1是回送地址，指本地机，一般用来测试使用。回送地址是本机回送地址（Loopback Address），
//        即主机IP堆栈内部的IP地址，主要用于网络软件测试以及本地机进程间通信，无论什么程序，一旦使用回送地址发送数据，
//        协议软件立即返回，不进行任何网络传输。

//        factory.setPort(15672);// MQ端口
//        factory.setUsername("guest");// MQ用户名
//        factory.setPassword("guest");// MQ密码

        Connection connection = factory.newConnection();
        Channel channel = connection.createChannel();

        //声明队列，主要为了防止消息接收者先运行此程序，队列还不存在时创建队列。
        channel.queueDeclare(QUEUE_NAME, false, false, false, null);
        System.out.println(" [*] Waiting for messages(等待消息产生). To exit press CTRL+C");

        //创建消费者对象，用于读取消息
        QueueingConsumer consumer = new QueueingConsumer(channel);
        //指定消费队列
        channel.basicConsume(QUEUE_NAME, true, consumer);

        //读取队列，并且阻塞，即在读到消息之前在这里阻塞，直到等到消息，完成消息的阅读后，继续阻塞循环
        //消费者程序运行开着 如果生产者新增了数据会自动获取
        while (true) {
            Thread.sleep(500);
            //nextDelivery是一个阻塞方法（内部实现其实是阻塞队列的take方法）
            QueueingConsumer.Delivery delivery = consumer.nextDelivery();
            String message = new String(delivery.getBody());
            System.out.println("'[x] Received '" + message );
            System.out.println("该消息已被消费掉" );
        }
    }

}
