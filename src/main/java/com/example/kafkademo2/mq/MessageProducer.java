package com.example.kafkademo2.mq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class MessageProducer {
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public String sent(String topic,String msg){
        kafkaTemplate.send(topic,msg);
        return "OK";
    }
}
