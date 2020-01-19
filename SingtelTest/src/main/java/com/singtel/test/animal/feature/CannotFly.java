package com.singtel.test.animal.feature;

public class CannotFly implements Flyable{

	@Override
	public void fly() {
		System.out.println("I cannot fly");
		
	}

}
