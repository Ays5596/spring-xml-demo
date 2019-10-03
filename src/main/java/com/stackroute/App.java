package com.stackroute;


import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args ) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        Movie hr1 = (Movie)applicationContext.getBean("movie",Movie.class);
        //Movie hr2 = applicationContext.getBean("movieB",Movie.class);
       // System.out.println(hr.getHR().getName());
       // System.out.println(hr.getHR().getGender());
       // System.out.println(hr.getHR().getAge());
       hr1.disp1();
    }
}
