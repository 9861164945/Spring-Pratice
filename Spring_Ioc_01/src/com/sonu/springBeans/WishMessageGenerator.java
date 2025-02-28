package com.sonu.springBeans;


import java.time.LocalDate;
import java.time.LocalTime;

public class WishMessageGenerator
{
	
	
	
	
	//Setter Injection
	
/*	private LocalTime time;
	//setter method for setter Injection
	public void setTime(LocalTime time) 
	{
		this.time=time;
		
	}
	//b.method
	public String showWishMessage(String user) 
	{
		//get Current Hour  of the day
		int hour=time.getHour();
		if(hour<12) {
			return "good Morning:"+user;
		}
		else if(hour<16) 
		{
			return "good Afternoon"+user;
			
		}
		else if(hour<20) 
		{
		return	"good Evening"+user;
			
		}
		else
		{
			return "good Night "+user;
			
		}
		
		
		
	}*/
	
	
	//Constructor Injection
	
	private LocalTime time;
	private LocalDate date;
	//Parameterized Constructor
	public WishMessageGenerator(LocalTime time, LocalDate date) 
	{
	
		this.time = time;
		this.date = date;
	}
	//Business Method
	public String showMessage(String user)
	{
		System.out.println("WishMessageGenerator.showMessage():"+time+" "+date);
		int hour= time.getHour();
		if(hour<12) 
		{
		 return "Good Morning "+user;
			
		}
		else if(hour<16) {
			return "Good Afternoon"+user;
		}
		else if(hour<20) {
			return "GOod Evening "+user;
		}
		else {
			return "good Night User";
		}
	}

}
