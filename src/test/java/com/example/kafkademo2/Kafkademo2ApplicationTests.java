package com.example.kafkademo2;

import com.example.kafkademo2.mq.MessageProducer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

@SpringBootTest
class Kafkademo2ApplicationTests {
    @Autowired
    private MessageProducer producer;
    
    @Test
    void contextLoads() {

        for (int i=0;i<100;i++){
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    while (true){
                        producer.sent("fuck", Thread.currentThread() + "ASd");
                    }
                }
            });
            thread.start();
        }


    }

}
