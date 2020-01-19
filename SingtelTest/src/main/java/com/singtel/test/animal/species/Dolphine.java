package com.singtel.test.animal.species;

import com.singtel.test.animal.Animal;
import com.singtel.test.animal.feature.Singable;
import com.singtel.test.animal.feature.Swimmable;

public class Dolphine extends Animal{

	private Swimmable swimmable;
	private Singable singable;
	
	public Dolphine(Swimmable swimmable, Singable singable) {
		this.swimmable = swimmable;
		this.singable = singable;
	}
	
	public void swim() {
		swimmable.swim();
	}
	
	public void sing() {
		singable.sing();
	}
	
}
