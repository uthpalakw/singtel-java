package com.singtel.test.animal.species;

import com.singtel.test.animal.Animal;
import com.singtel.test.animal.feature.Singable;
import com.singtel.test.animal.feature.Swimmable;
import com.singtel.test.animal.feature.Walkable;

public class Fish extends Animal{

	private Singable singable;
	private Swimmable swimmable;
	private Walkable walkable;
	
	public Fish(Singable singable, Swimmable swimmable, Walkable walkable) {
		this.singable = singable;
		this.swimmable = swimmable;
		this.walkable = walkable;
	}
	
	public void sing() {
		singable.sing();
	}
	
	public void swim() {
		swimmable.swim();
	}
	
	public void walk() {
		walkable.walk();
	}
}
