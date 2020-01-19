package com.singtel.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.singtel.test.animal.feature.CanSwim;
import com.singtel.test.animal.feature.CannotSing;
import com.singtel.test.animal.feature.CannotWalk;
import com.singtel.test.animal.species.Shark;

public class TestShark {

	@Test
	public void testShark() {
		Shark shark = new Shark(new CannotSing(), new CanSwim(), new CannotWalk());
		shark.setSize("Large");
		shark.setColor("Gray");
		
		assertEquals("Large", shark.getSize());
		assertEquals("Gray", shark.getColor());
	}

}
