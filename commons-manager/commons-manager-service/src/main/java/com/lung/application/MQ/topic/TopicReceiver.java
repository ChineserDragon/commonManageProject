package com.lung.application.MQ.topic;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

public class TopicReceiver implements MessageListener {
    @Override
    public void onMessage(Message message) {
        TextMessage textMessage = (TextMessage) message;
        try {
            System.out.println("TopicReceiver接收到的数据是："+textMessage.getText());
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }
}
