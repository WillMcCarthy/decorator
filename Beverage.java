package com.hfdp.decorator.decorator;

public abstract class Beverage {
	private String  description;
	
	public  Beverage() {
		this.description = "Unknown beverage";
	}
	public  Beverage( String description ) {
		this.description = description;
	}
	public abstract double  cost();	// MUST be overridden by subclasses
	
	public String  getDescription()  {  return  description;  }
}
