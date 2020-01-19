package com.singtel.test.animal.feature;

public class CannotWalk implements Walkable{

	@Override
	public void walk() {
		System.out.println("I cannot walk");
		
	}

}
