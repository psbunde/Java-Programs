package com.app.fruits;

public class Mango extends Fruit{
	
	public Mango()
	{
		
	}
	
	public Mango(String clr, double wt,String nm, boolean frh)
	{
		super(clr,wt,nm,frh);
		super.toString();
	}
	
	public String taste()
	{
		return "Sweet";
	}
	
	public void pulp()
	{
		System.out.println("Name: "+super.getName()+"Color: "+super.getColor()+" Creating Pulp");
	}
	
	
}
