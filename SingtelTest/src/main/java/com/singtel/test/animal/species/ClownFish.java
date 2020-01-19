package com.singtel.test.animal.species;

import com.singtel.test.animal.feature.Singable;
import com.singtel.test.animal.feature.Swimmable;
import com.singtel.test.animal.feature.Walkable;

public class ClownFish extends Fish{

	private String size;
	private String color;
	
	public ClownFish(Singable singable, Swimmable swimmable, Walkable walkable) {
		super(singable, swimmable, walkable);
		
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
