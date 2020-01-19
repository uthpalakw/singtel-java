package com.singtel.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.singtel.test.animal.feature.CanFly;
import com.singtel.test.animal.feature.CanSing;
import com.singtel.test.animal.feature.CockADoo;
import com.singtel.test.animal.feature.Meow;
import com.singtel.test.animal.feature.PhoneRing;
import com.singtel.test.animal.feature.Quack;
import com.singtel.test.animal.feature.Woof;
import com.singtel.test.animal.species.Parrot;
import com.singtel.test.util.Locale;

public class TestParrot {

	@Test
	public void testParrotWithDogs() {
		Parrot parrotWithDogs = new Parrot(new CanFly(), new CanSing(), new Woof());
		parrotWithDogs.makeSound();
	}
	
	@Test
	public void testParrotWithCats() {
		Parrot parrotWithCats = new Parrot(new CanFly(), new CanSing(), new Meow());
		parrotWithCats.makeSound();
	}
	
	@Test
	public void testParrotWithRooster() {
		Parrot parrotWithRooster = new Parrot(new CanFly(), new CanSing(), new CockADoo(Locale.EN));
		parrotWithRooster.makeSound();
	}
	
	@Test
	public void testParrotWithDuck() {
		Parrot parrotWithDuck = new Parrot(new CanFly(), new CanSing(), new Quack());
		parrotWithDuck.makeSound();
	}
	
	@Test
	public void testParrotNearPhone() {
		Parrot parrotNearPhone = new Parrot(new CanFly(), new CanSing(), new PhoneRing());
		parrotNearPhone.makeSound();
	}

}
