package com.singtel.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.singtel.test.animal.feature.CanSwim;
import com.singtel.test.animal.feature.CannotSing;
import com.singtel.test.animal.feature.CannotWalk;
import com.singtel.test.animal.species.Fish;

public class TestFish {

	@Test
	public void test() {
		Fish fish = new Fish(new CannotSing(), new CanSwim(), new CannotWalk());
		fish.sing();
		fish.swim();
		fish.walk();
	}

}
