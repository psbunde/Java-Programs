package com.app.fruits;

public class Apple extends Fruit{

	public Apple()
	{
	}
	
	public Apple(String clr, double wt,String nm, boolean frh)
	{
		super(clr,wt,nm,frh);
	}
	
	public String taste()
	{
		return "Sweet and Sour";
	}
	
	public void jam()
	{
		System.out.println("Name: "+super.getName()+"Color: "+super.getColor()+" Making Jam");
	}	
}
