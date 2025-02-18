package com.sonu.springMain;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.sonu.springBeans.SeasonTracker;

public class DependencyInjection2
{
    public static void main(String[] args) 
    {
        // Create IOC container
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/sonu/springConfig/applicationContext.xml");
        
        // Get the bean
        SeasonTracker ses = ctx.getBean("ses", SeasonTracker.class);
        
        // Invoke the bean method
        String result = ses.showSeason("Sonu");
        //Print the Result
        System.out.println("Result is:: " + result);
        
        // Close the context
        ctx.close();
    }
}
