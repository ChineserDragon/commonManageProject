package com.lung.application.MQ.queue;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

public class QueueReceiver implements MessageListener {
    @Override
    public void onMessage(Message message) {
        TextMessage textMessage = (TextMessage) message;
        try {
            System.out.println("QueueReceiver接收到的数据是："+textMessage.getText());
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }
}
