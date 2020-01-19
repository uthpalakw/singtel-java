package com.singtel.test.animal.feature;

import java.util.Locale;
import java.util.ResourceBundle;

public class CockADoo implements Sound{

	private ResourceBundle resourceBundle;
	
	public CockADoo(com.singtel.test.util.Locale lan) {
		Locale locale = new Locale(lan.toString());
		resourceBundle = ResourceBundle.getBundle("language",locale);
	}
	
	@Override
	public void makeSound() {
		System.out.println(resourceBundle.getString("make.sound"));
		
	}

}
