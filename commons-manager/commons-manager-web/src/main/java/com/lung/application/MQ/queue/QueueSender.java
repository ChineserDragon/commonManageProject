package com.lung.application.MQ.queue;

import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;

import javax.annotation.Resource;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

public class QueueSender {

    @Resource
    private JmsTemplate jmsQueueTemplate;

    //发送消息
    public void sendMessage(Destination destination, final String message) {
        System.out.println("QueueSender发送消息：" + message);
        /**
         * 设置超时时间
         */
//        jmsQueueTemplate.setTimeToLive(10);

        /**
         * 设置权重
         */
//        jmsQueueTemplate.setPriority(4);
        jmsQueueTemplate.send(destination, new MessageCreator() {

            @Override
            public Message createMessage(Session session) throws JMSException {
                // TODO Auto-generated method stub
                return session.createTextMessage(message);
            }
        });
    }

}
