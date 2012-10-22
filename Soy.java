package com.hfdp.decorator.decorator;

public class  Soy extends CondimentDecorator {
	public  Soy( Beverage beverage ) {
		super( beverage );
	}
	public double   cost() {
		return  0.15 + getDecorated().cost();
	}
	public String  getDescription() {
		return  getDecorated().getDescription() + ", Soy";
	}
}
