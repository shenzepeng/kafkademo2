package com.example.kafkademo2.mq;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * kafka消费者测试
 */
@Component
public class MessageListener {
    @KafkaListener(topics = "fuck")
    public void listen(ConsumerRecord<?, ?> record) throws Exception {
        //控制台打印send进来的信息
        System.out.printf("topic = %s, offset = %d, value = %s \n", record.topic(), record.offset(), record.value());
    }

}
