package com.app.fruits;

public class Fruit {
	private String color;
	private double weight;
	private String name;
	private boolean fresh;
	
	Fruit()
	{
		
	}
	
	Fruit(String clr, double wt,String nm, boolean frh)
	{
		color = clr;
		weight = wt;
		name = nm;
		fresh = frh;
	}
	
	public String toString()
	{
		return "name: "+name+" color: "+color+" weight: "+weight+" fresh:"+fresh;
	}
	
	public String taste()
	{
		return "No Specific Test";
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getColor()
	{
		return color;
	}
	
	public Boolean isFresh()
	{
		return fresh;
	}
	
	public void setFresh(Boolean fresh)
	{
		this.fresh=fresh;
	}
}
