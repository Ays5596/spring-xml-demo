package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class App2 {
    public static void main( String[] args ) {
      //  ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        XmlBeanFactory fact = new XmlBeanFactory(new ClassPathResource("beans.xml"));
        Movie hero = (Movie)fact.getBean("movie");
        //Movie hr = applicationContext.getBean("movie",Movie.class);
        // System.out.println(hr.getHR().getName());
        // System.out.println(hr.getHR().getGender());
        // System.out.println(hr.getHR().getAge());
        hero.disp();
    }
}
