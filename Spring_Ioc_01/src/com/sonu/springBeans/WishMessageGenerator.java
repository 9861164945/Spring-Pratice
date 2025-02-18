package com.sonu.springBeans;


import java.time.LocalTime;

public class WishMessageGenerator
{
	
	private LocalTime time;
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
		
		
	}

}
