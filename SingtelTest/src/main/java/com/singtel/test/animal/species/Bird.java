package com.singtel.test.animal.species;

import com.singtel.test.animal.Animal;
import com.singtel.test.animal.feature.Flyable;
import com.singtel.test.animal.feature.Singable;
import com.singtel.test.animal.feature.Swimmable;
import com.singtel.test.animal.feature.Walkable;

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

	public Singable getSingable() {
		return singable;
	}

	public void setSingable(Singable singable) {
		this.singable = singable;
	}

	@Override
	public Flyable getflFlyable() {
		return flyable;
	}

	@Override
	public Walkable getWalkable() {
		return null;
	}

	@Override
	public Swimmable getSwimmable() {
		return null;
	}
}
