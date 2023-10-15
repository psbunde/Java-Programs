package com.app.fruits;

public class Orange extends Fruit{
	
	public Orange()
	{
		
	}
	
	public Orange(String clr, double wt,String nm, boolean frh)
	{
		super(clr,wt,nm,frh);
	}
	
	public String taste()
	{
		return "sour";
	}
	
	public void juice()
	{
		System.out.println("Name: "+super.getName()+"Color: "+super.getColor()+" Extracting Juice");
	}
}
