package com.hfdp.decorator.decorator;

public class  Whip extends CondimentDecorator {
	public  Whip( Beverage beverage ) {
		super( beverage );
	}
	public double   cost() {
		return  0.10 + getDecorated().cost();
	}
	public String  getDescription() {
		return  getDecorated().getDescription() + ", Whip";
	}
}
