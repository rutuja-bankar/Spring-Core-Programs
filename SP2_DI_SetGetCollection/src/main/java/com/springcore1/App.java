package com.springcore1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//Inject Collection Data Types 

public class App 
{
    public static void main( String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        Student s1 = (Student) context.getBean("studBean");
        System.out.println("\n\n"+s1);
}
}
