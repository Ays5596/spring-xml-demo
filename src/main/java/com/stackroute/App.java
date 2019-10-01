package com.stackroute;


import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args ) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        Movie hr = applicationContext.getBean("movie",Movie.class);
       // System.out.println(hr.getHR().getName());
       // System.out.println(hr.getHR().getGender());
       // System.out.println(hr.getHR().getAge());
        hr.disp();
    }
}
