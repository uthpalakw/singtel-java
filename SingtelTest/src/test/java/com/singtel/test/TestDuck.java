package com.singtel.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.singtel.test.animal.feature.CanFly;
import com.singtel.test.animal.feature.CanSing;
import com.singtel.test.animal.feature.CanSwim;
import com.singtel.test.animal.feature.Quack;
import com.singtel.test.animal.species.Duck;

public class TestDuck {

	@Test
	public void testSound() {
		Duck duck = new Duck(new CanFly(), new CanSing(), new Quack(), new CanSwim());
		duck.makeSound();
	}
	
	@Test
	public void testSwim() {
		Duck duck = new Duck(new CanFly(), new CanSing(), new Quack(), new CanSwim());
		duck.swim();
	}

}
