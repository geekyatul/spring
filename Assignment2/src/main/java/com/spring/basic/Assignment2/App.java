package com.spring.basic.Assignment2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 ApplicationContext applicationContext=new  AnnotationConfigApplicationContext(Config.class);
         
         Movie movie=(Movie) applicationContext.getBean("getMovie",Movie.class);
    
         System.out.println(movie);
    }
}

