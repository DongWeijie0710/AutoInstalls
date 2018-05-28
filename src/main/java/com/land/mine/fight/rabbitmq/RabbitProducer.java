package com.land.mine.fight.rabbitmq;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeoutException;

/**
 * @task: RabbitMQ生产者
 * @discrption:
 * @author: dongweijie
 * @date: 2018/5/28
 * @version: 1.0.0
 */
public class RabbitProducer {

    private final static String QUEUE_NAME = "RabbitMQ_Hello";//消息队列名，不能重复，否则之前已有会失败

    public static void main(String[] argv) throws IOException, TimeoutException {


        ConnectionFactory factory = new ConnectionFactory(); //创建连接连接到RabbitMQ
        factory.setHost("127.0.0.1");// 设置MQ的IP
//        factory.setPort(15672);// 设置MQ端口
//        factory.setUsername("guest");//设置MQ用户名
//        factory.setPassword("guest");//设置MQ密码
//        try {
//            factory.setUri("amqp://guest:guest@localhost:15672"); //设置url(包括ip、端口、用户名、密码)
//        } catch (URISyntaxException e) {
//            e.printStackTrace();
//        } catch (NoSuchAlgorithmException e) {
//            e.printStackTrace();
//        } catch (KeyManagementException e) {
//            e.printStackTrace();
//        }

        Connection connection = factory.newConnection(); //创建一个连接
        Channel channel = connection.createChannel(); //创建一个频道

        //指定一个队列
        channel.queueDeclare(QUEUE_NAME, false, false, false, null);

        Map<String, Object> map = new HashMap<>();
        map.put("java", "hello");
        map.put("RabbitMQ", "Hello");
        map.put("Jackson", "Love U");
        String message = map.toString();  //发送的消息

        //往队列中发出一条消息
        channel.basicPublish("", QUEUE_NAME, null, message.getBytes());
        System.out.println(" [x] Sent '" + message + "'");

        //关闭频道和连接
        channel.close();
        connection.close();
    }

}
