package com.sonu.springBeans;

import java.time.LocalDate;


public class SeasonTracker 
{
	 private LocalDate date;

	public void setDate(LocalDate date) 
	{
		this.date = date;
	}
	
	public String showSeason(String name) 
	{
	    int month = date.getMonthValue();
	    if (month >= 3 && month <= 5) 
	    {
	        return  name +" Now Summer Season " ;
	    }
	    else if (month >= 6 && month <= 8) 
	    {
	        return  name+" Now Rainy Season " ;
	    }
	    else 
	    {
	        return name+" Now Winter Season " ;
	    }
	}

	}



