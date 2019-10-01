package com.stackroute;


import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args ) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        Movie hr1 = applicationContext.getBean("movieA",Movie.class);
        Movie hr2 = applicationContext.getBean("movieB",Movie.class);
       // System.out.println(hr.getHR().getName());
       // System.out.println(hr.getHR().getGender());
       // System.out.println(hr.getHR().getAge());
        hr2.disp1();
        hr2.disp2();
        hr2.disp3();
        System.out.println(hr1==hr2);
    }
}
