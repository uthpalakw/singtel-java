package com.singtel.test.animal.species;

import com.singtel.test.animal.Animal;
import com.singtel.test.animal.feature.Flyable;
import com.singtel.test.animal.feature.Sound;

public class Butterfly extends Animal{
	
	private Flyable flyable;
	private Sound sound;
	
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

}
