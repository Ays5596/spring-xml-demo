package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Movie implements ApplicationContextAware, BeanFactoryAware, BeanNameAware {
    private Actor HR;
    ApplicationContext applicationContext;
    BeanFactory beanFactory;
    String s;


    public Movie(Actor HR) {
        this.HR = HR;
    }

    public Actor getHR() {
        return HR;
    }

    public void setHR(Actor HR) {
        this.HR = HR;
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
         this.beanFactory = beanFactory;
        System.out.println("BeanFactory is Awared");
    }

    @Override
    public void setBeanName(String s) {
          this.s = s;
        System.out.println("BeanName is awared");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
          this.applicationContext = applicationContext;
        System.out.println("AppContext is awared.");
    }

    public void disp1(){
        System.out.println("Name: "+HR.getName()+" Gender: "+HR.getGender()+" Age: "+HR.getAge());
    }
}
