package com.singtel.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.singtel.test.animal.feature.CannotFly;
import com.singtel.test.animal.feature.CannotSing;
import com.singtel.test.animal.feature.CockADoo;
import com.singtel.test.animal.species.Rooster;

public class TestRooster {

	@Test
	public void testSound() {
		Rooster rooster = new Rooster(new CannotFly(), new CannotSing(), new CockADoo());
		rooster.makeSound();
	}

}
