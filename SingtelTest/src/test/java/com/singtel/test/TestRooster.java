package com.singtel.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.singtel.test.animal.feature.CannotFly;
import com.singtel.test.animal.feature.CannotSing;
import com.singtel.test.animal.feature.CockADoo;
import com.singtel.test.animal.species.Rooster;
import com.singtel.test.util.Locale;

public class TestRooster {

	@Test
	public void testSound() {
		Rooster rooster = new Rooster(new CannotFly(), new CannotSing(), new CockADoo(Locale.EN));
		rooster.makeSound();
	}
	
	@Test
	public void testSoundDanish() {
		Rooster rooster = new Rooster(new CannotFly(), new CannotSing(), new CockADoo(Locale.DAN));
		rooster.makeSound();
	}
	
	@Test
	public void testSoundDutch() {
		Rooster rooster = new Rooster(new CannotFly(), new CannotSing(), new CockADoo(Locale.DUT));
		rooster.makeSound();
	}

}
