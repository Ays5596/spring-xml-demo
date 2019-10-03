package com.stackroute.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifeCycleDemoBean implements InitializingBean, DisposableBean {
    private String msg;

    public void setMsg(String msg) {
        this.msg = msg;
    }
    public static void customInit(){
        System.out.println("< at the customInit >");
    }
    public static void customDestroy(){
        System.out.println("<at the customDestroy >");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Destroyed !");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("After prop. is there: " +msg);
    }
}
