package com.singtel.test.animal.species;

import com.singtel.test.animal.Animal;
import com.singtel.test.animal.feature.Flyable;
import com.singtel.test.animal.feature.Singable;
import com.singtel.test.animal.feature.Sound;
import com.singtel.test.animal.feature.Swimmable;
import com.singtel.test.animal.feature.Walkable;

public class Butterfly extends Animal{
	
	private Flyable flyable;
	private Sound sound;
	private Singable singable;
	
	public Butterfly(Flyable flyable, Sound sound) {
		this.flyable = flyable;
		this.sound = sound;
	}
	
	public void fly() {
		flyable.fly();
	}
	
	public void makeSound() {
		sound.makeSound();
	}

	@Override
	public Singable getSingable() {
		return singable;
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
