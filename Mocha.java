package com.hfdp.decorator.decorator;

public class  Mocha extends CondimentDecorator {
	public  Mocha( Beverage beverage ) {
		super( beverage );
	}
	public double   cost()  {  
		return  0.20 + getDecorated().cost();  
	}
	public String  getDescription()   {  
		return  getDecorated().getDescription() + ", Mocha";
	}
}
