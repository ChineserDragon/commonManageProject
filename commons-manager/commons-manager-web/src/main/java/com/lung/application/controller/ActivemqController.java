package com.lung.application.controller;

import com.lung.application.MQ.queue.QueueSender;
import com.lung.application.MQ.topic.TopicSender;
import org.apache.ibatis.annotations.Update;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.jms.Destination;

@RestController
@RequestMapping(value = "activemq")
public class ActivemqController {

    @Autowired
    private QueueSender queueSender;

    @Autowired
    private TopicSender topicSender;

    @Autowired
    @Qualifier("queueDestination")
    private Destination queueDestination;

    @Autowired
    @Qualifier("topicDestination")
    private Destination topicDestination;

    @RequestMapping(value = "sendMessage")
    public String testSend() {
        try {
            for (int i = 0; i < 5; i++) {
                queueSender.sendMessage(queueDestination, "queue生产者产生消息:" + (i + 1));
            }

            for (int i = 0; i < 5; i++) {
                topicSender.sendMessage(topicDestination, "topic生产者产生消息:" + (i + 1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return "success";

    }


}
