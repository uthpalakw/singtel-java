package com.singtel.test.animal.species;

import com.singtel.test.animal.feature.Flyable;
import com.singtel.test.animal.feature.Singable;
import com.singtel.test.animal.feature.Sound;
import com.singtel.test.animal.feature.Swimmable;

public class Duck extends Bird{

	private Sound sound;
	private Swimmable swimmable;
	
	public Duck(Flyable flyable, Singable singable) {
		super(flyable, singable);
		
	}
	
	public Duck(Flyable flyable, Singable singable, Sound sound, Swimmable swimmable) {
		super(flyable, singable);
		this.sound = sound;
		this.swimmable = swimmable;
	}
	
	public void makeSound() {
		sound.makeSound();
	}
	
	public void swim() {
		swimmable.swim();
	}
	
	@Override
	public Swimmable getSwimmable() {
		return swimmable;
	}

}
