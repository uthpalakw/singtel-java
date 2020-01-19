package com.singtel.test.service;

import java.util.ArrayList;
import java.util.List;

import com.singtel.test.animal.Animal;
import com.singtel.test.animal.feature.CanFly;
import com.singtel.test.animal.feature.CanSing;
import com.singtel.test.animal.species.Bird;

public class AnimalService {
	
	public List<Animal> getAllAnimals(){
		System.out.println("Return all animals");
		List<Animal> animals = new ArrayList<>();
		return animals;
	}
	
	public Animal getSpecies(String species) {
		
		if(species.equals("bird")) {
			return new Bird(new CanFly(), new CanSing());
		}
		return null;
	}

}
