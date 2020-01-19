package com.singtel.test.animal.feature;

import java.util.Locale;
import java.util.ResourceBundle;

public class CannotFly implements Flyable{
	
	@Override
	public void fly() {
		System.out.println("I cannot fly");
		
	}

}
