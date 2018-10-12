package com.lung.application;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext =
                new ClassPathXmlApplicationContext("classpath:/spring/spring-introduce.xml");
        int beanDefinitionCount = classPathXmlApplicationContext.getBeanDefinitionCount();
        System.out.println(beanDefinitionCount);
        String[] beanDefinitionNames = classPathXmlApplicationContext.getBeanDefinitionNames();
        for (String str :
                beanDefinitionNames) {
            System.out.println(str);
        }
    }
}
