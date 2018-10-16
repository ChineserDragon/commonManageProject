package com.lung.common.utils;

import lombok.extern.log4j.Log4j;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Log4j
public class ManagerBeansName implements ApplicationContextAware {

    ApplicationContext applicationContext = null;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    @PostConstruct
    public void init() {
        int beanDefinitionCount = applicationContext.getBeanDefinitionCount();
        log.info("beanDefinitionCount" + beanDefinitionCount);
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String str :
                beanDefinitionNames) {
            System.out.println(str);
        }
    }
}
