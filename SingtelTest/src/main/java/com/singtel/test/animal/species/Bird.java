package com.singtel.test.animal.species;

import com.singtel.test.animal.Animal;
import com.singtel.test.animal.feature.Flyable;
import com.singtel.test.animal.feature.Singable;

public class Bird extends Animal{

	private Flyable flyable;
	private Singable singable;
	
	public Bird(Flyable flyable, Singable singable) {
		this.flyable = flyable;
		this.singable = singable;
	}
	
	public void fly() {
		flyable.fly();
	}
	
	public void sing() {
		singable.sing();
	}
}
