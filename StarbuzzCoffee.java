package com.hfdp.decorator.decorator;

import java.util.ArrayList;

public class StarbuzzCoffee {		
	
	public static void  displayBeverage( Beverage beverage ) {
		System.out.printf( "%s-----$%,.2f\n", beverage.getDescription(),
				beverage.cost() );
	}
	public static void  main( String[] args ) {
		ArrayList<Beverage> order = new ArrayList<Beverage>();
		
		Beverage  es = new Espresso();
		order.add( es );
		
		Beverage  dr = new DarkRoast();
		dr = new Mocha( dr );
		dr = new Mocha( dr );
		dr = new Whip(  dr );
		order.add( dr );
		
		Beverage hb = new HouseBlend();
		hb = new Soy(   hb );
		hb = new Mocha( hb );
		hb = new Whip(  hb );
		order.add( hb );
		
		order.add( new Milk( new Mocha( new Whip( new Decaf() ) ) ) );
		
		for (int i = 0; i < 10; i++)
			order.add( new Mocha( new HouseBlend()) );
				
		System.out.printf( "Your order was:...\n" );
		System.out.println( "============================" );
		double  total = 0.0;
//		for (Beverage beverage : order ) {
	for (int i = 0; i < order.size(); i++ ) {
			Beverage  beverage = order.get( i );
			total += beverage.cost();
			displayBeverage( beverage );
		}
		System.out.println( "============================" );
		System.out.printf(  "TOTAL: ---- $%,.2f", total );
	}
}
