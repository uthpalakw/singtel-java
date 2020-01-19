package com.singtel.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.singtel.test.animal.feature.CanSing;
import com.singtel.test.animal.feature.CanSwim;
import com.singtel.test.animal.species.Dolphine;

public class TestDolphine {

	@Test
	public void testDolphine() {
		Dolphine dolphine = new Dolphine(new CanSwim(), new CanSing());
		dolphine.swim();
		dolphine.sing();
	}

}
