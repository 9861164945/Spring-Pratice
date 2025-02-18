package com.sonu.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.sonu.springBeans.WishMessageGenerator;

public class DependencyInjectionTest
{
	public static void main(String[] args) 
	{
		//  Create IOc container
		FileSystemXmlApplicationContext ctx=new FileSystemXmlApplicationContext("src/com/sonu/springConfig/applicationContext.xml");
		//Get Target Spring bean class obj ref
		WishMessageGenerator gen=ctx.getBean("wmg",WishMessageGenerator.class);
		//Invoke the bean method
		String result=gen.showWishMessage("sonu");
		System.out.println("result is::"+result);
		ctx.close();
		
	}

}
