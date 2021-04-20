package com.mvc.spring.itss.controllers;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class SpringContextUtil implements ApplicationContextAware, BeanNameAware {
    private static ApplicationContext applicationContext;     

    public void setApplicationContext(ApplicationContext context) throws BeansException {
      applicationContext = context;
    }

    public static ApplicationContext getApplicationContext() {
      return applicationContext;
    }
    
    @Override
    public void setBeanName(String beanName)
    {
    	System.out.println("Bean Name is: " +beanName);
    }
    
}