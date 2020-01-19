package com.singtel.test.animal;

import com.singtel.test.animal.feature.Flyable;
import com.singtel.test.animal.feature.Singable;
import com.singtel.test.animal.feature.Swimmable;
import com.singtel.test.animal.feature.Walkable;

public abstract class Animal {
	
	public void walk(){
		System.out.println("I am walking");
	}
	
	public abstract Singable getSingable();
	public abstract Flyable getflFlyable();
	public abstract Walkable getWalkable();
	public abstract Swimmable getSwimmable();

}
