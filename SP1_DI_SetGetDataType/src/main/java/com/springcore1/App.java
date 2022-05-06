package com.springcore1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//Inject Primitive Data 
public class App 
{
    public static void main( String[] args )
    {
	/*        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
	
	        Student s1 = (Student) context.getBean("studBean1");
	//        Student s1 = (Student) context.getBean("studBean1");
	        System.out.println(s1);

        Student s2 = (Student) context.getBean("studBean2");
        System.out.println(s2);
*/

    	
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
       Student s1 = (Student) context.getBean("studBean1");
       // Student s1 = context.getBean("studBean1",Student.class);
        System.out.println(s1);
        context.close();
        
    }
}
