package com.singtel.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.singtel.test.animal.feature.CanSwim;
import com.singtel.test.animal.feature.CannotSing;
import com.singtel.test.animal.feature.CannotWalk;
import com.singtel.test.animal.species.ClownFish;

public class TestClownFish {

	@Test
	public void test() {
		ClownFish clownFish = new ClownFish(new CannotSing(), new CanSwim(), new CannotWalk());
		clownFish.setColor("Orange");
		clownFish.setSize("Small");
		
		assertEquals("Orange", clownFish.getColor());
		assertEquals("Small", clownFish.getSize());
	}

}
