package com.singtel.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.singtel.test.animal.feature.CanSing;
import com.singtel.test.animal.feature.CannotFly;
import com.singtel.test.animal.feature.Cluck;
import com.singtel.test.animal.species.Chicken;

public class TestChicken {

	@Test
	public void testFly() {
		Chicken chicken = new Chicken(new CannotFly(), new CanSing(), new Cluck());
		chicken.fly();
	}
	
	@Test
	public void testSound() {
		Chicken chicken = new Chicken(new CannotFly(), new CanSing(), new Cluck());
		chicken.makeSound();;
	}

}
