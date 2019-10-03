package com.stackroute;


import com.stackroute.demo.BeanLifeCycleDemoBean;
import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args ) {
        ApplicationContext appContext = new ClassPathXmlApplicationContext("beans.xml");
        BeanLifeCycleDemoBean bean = appContext.getBean("beanLifeCycleDemoBean",BeanLifeCycleDemoBean.class);
        //Movie hr2 = applicationContext.getBean("movieB",Movie.class);
       // System.out.println(hr.getHR().getName());
       // System.out.println(hr.getHR().getGender());
       // System.out.println(hr.getHR().getAge());
      //  System.out.println(bean);
        ((AbstractApplicationContext)appContext).close();
    }
}
