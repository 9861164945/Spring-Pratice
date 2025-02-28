package com.sonu.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContextExtensionsKt;

import com.sonu.beans.WeakDayFinder;
import com.sonu.config.AppConfig;

public class DependencyInjectionTest
{ 
	public static void main(String[] args) 
	{
	

	
	AnnotationConfigApplicationContext ctx=new  AnnotationConfigApplicationContext(AppConfig.class);
	
	Object obj=ctx.getBean("wdf");
	WeakDayFinder finder=(WeakDayFinder)obj;
	String msg=finder.showMessage("sonu");
	System.out.println("Result is :"+msg);
       ctx.close();
}

}

