package com.stackroute;


import com.stackroute.demo.BeanLifeCycleDemoBean;
import com.stackroute.demo.BeanPostProcessorDemoBean;
import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args ) {
        ApplicationContext appContext = new ClassPathXmlApplicationContext("beans.xml");
       Movie hr = appContext.getBean("movie", Movie.class);
       //BeanPostProcessorDemoBean bean = appContext.getBean("beanPostProcessorDemoBean", BeanPostProcessorDemoBean.class);
        //Movie hr2 = applicationContext.getBean("movieB",Movie.class);
       // System.out.println(hr.getHR().getName());
       // System.out.println(hr.getHR().getGender());
       // System.out.println(hr.getHR().getAge());
      //  System.out.println(bean);
     //   hr.disp1();
        ((AbstractApplicationContext)appContext).close();
    }
}
