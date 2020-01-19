package com.singtel.test.animal.feature;

public class CannotSing implements Singable{

	@Override
	public void sing() {
		System.out.println("I cannot sing");
		
	}

}
