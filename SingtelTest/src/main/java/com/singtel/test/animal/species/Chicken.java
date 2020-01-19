package com.singtel.test.animal.species;

import com.singtel.test.animal.feature.Flyable;
import com.singtel.test.animal.feature.Singable;
import com.singtel.test.animal.feature.Sound;

public class Chicken extends Bird{

	private Sound sound;
	
	public Chicken(Flyable flyable, Singable singable) {
		super(flyable, singable);
		
	}
	
	public Chicken(Flyable flyable, Singable singable, Sound sound) {
		super(flyable, singable);
		this.sound = sound;
		
	}
	
	public void makeSound() {
		sound.makeSound();
	}

}
