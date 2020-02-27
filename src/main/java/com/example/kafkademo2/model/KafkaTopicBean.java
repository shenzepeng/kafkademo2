package com.example.kafkademo2.model;

import lombok.Data;

@Data
public class KafkaTopicBean {
    private String  topicName;
    private Integer partition;
    private Integer replication;
}
