package com.hfdp.decorator.decorator;

public class  Milk extends CondimentDecorator {
	public  Milk( Beverage beverage ) {
		super( beverage );
	}
	public double   cost() {
		return  0.20 + getDecorated().cost();
	}
	public String  getDescription() {
		return  getDecorated().getDescription() + ", Steamed Milk";
	}
}
