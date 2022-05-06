package com.springcore1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// Stereotype Annotations | @Component Annotation | @Value Annotation 

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        Student obj = context.getBean("myObj",Student.class);
        System.out.println(obj);
    }
}
