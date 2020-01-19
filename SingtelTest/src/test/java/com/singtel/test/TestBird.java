package com.singtel.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.singtel.test.animal.Animal;
import com.singtel.test.animal.feature.CanFly;
import com.singtel.test.animal.feature.CanSing;
import com.singtel.test.animal.species.Bird;

public class TestBird {

	@Test
	public void testBirdFly() {
		Bird bird= new Bird(new CanFly(), new CanSing());
		bird.fly();
		
	}
	
	@Test
	public void testBirdWalk() {
		Bird bird= new Bird(new CanFly(), new CanSing());
		bird.walk();
	}
	
	@Test
	public void testBirdSing() {
		Bird bird= new Bird(new CanFly(), new CanSing());
		bird.sing();
	}

}
