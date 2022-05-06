package com.springcore1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// Spring Bean Scope - Prototype

public class App 
{
    public static void main( String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        Student obj = (Student) context.getBean("beanStudent");
        obj.setName("Abcd");
        System.out.println("Student Name = " + obj.getName() +"\n");

        // Due to Singleton Scope IoC will create object only once and share reference with all other
        
        Student obj2 = (Student) context.getBean("beanStudent");
        System.out.println("Student Name = " + obj2.getName() +"\n");
        
        // to cross check this; if we print hashCode of both objects then it will print same hashCode
        System.out.println("obj  = " + obj.hashCode());
        System.out.println("obj2 = " + obj2.hashCode() +"\n");
        
        System.out.println("Pointing to the same object = " + (obj == obj2));
        
    }
}
