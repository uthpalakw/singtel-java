package com.singtel.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.singtel.test.animal.feature.CanFly;
import com.singtel.test.animal.feature.NoSound;
import com.singtel.test.animal.species.Butterfly;

public class TestButterfly {

	@Test
	public void test() {
		Butterfly butterfly = new Butterfly(new CanFly(), new NoSound());
		butterfly.fly();
		butterfly.makeSound();
	}

}
