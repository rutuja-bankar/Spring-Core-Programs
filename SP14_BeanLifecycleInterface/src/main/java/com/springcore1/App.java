package com.springcore1;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//Inject Reference Type

public class App 
{
    public static void main( String[] args)
    {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        Student obj = (Student) context.getBean("beanStudent");
        System.out.println(obj);
        context.registerShutdownHook();
    }
}
