package com.singtel.test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Test;

import com.singtel.test.animal.Animal;
import com.singtel.test.animal.feature.CanFly;
import com.singtel.test.animal.feature.CanSing;
import com.singtel.test.animal.feature.CanSwim;
import com.singtel.test.animal.feature.CanWalk;
import com.singtel.test.animal.feature.CannotFly;
import com.singtel.test.animal.feature.CannotSing;
import com.singtel.test.animal.feature.CannotWalk;
import com.singtel.test.animal.feature.Cluck;
import com.singtel.test.animal.feature.CockADoo;
import com.singtel.test.animal.feature.NoSound;
import com.singtel.test.animal.feature.Quack;
import com.singtel.test.animal.feature.Woof;
import com.singtel.test.animal.species.Bird;
import com.singtel.test.animal.species.Butterfly;
import com.singtel.test.animal.species.Chicken;
import com.singtel.test.animal.species.ClownFish;
import com.singtel.test.animal.species.Dolphine;
import com.singtel.test.animal.species.Duck;
import com.singtel.test.animal.species.Fish;
import com.singtel.test.animal.species.Parrot;
import com.singtel.test.animal.species.Rooster;
import com.singtel.test.animal.species.Shark;

public class CountObj {

	@Test
	public void testAnimalCanSing() {
		Animal[] animal = new Animal[] {new Bird(new CanFly(), new CanSing()), 
										new Fish(new CannotSing(), new CanSwim(), new CannotWalk()),
										new Dolphine(new CanSwim(), new CanSing()),	
										new Duck(new CanFly(), new CanSing(), new Quack(), new CanSwim()),
										new Chicken(new CannotFly(), new CanSing(), new Cluck()),
										new Rooster(new CannotFly(), new CannotSing(), new CockADoo()),
										new Parrot(new CanFly(), new CanSing(), new Woof()),
										new Shark(new CannotSing(), new CanSwim(), new CannotWalk()),
										new ClownFish(new CannotSing(), new CanSwim(), new CannotWalk()),
										new Butterfly(new CanFly(), new NoSound())};
		
		
		List<Animal> list = Arrays.asList(animal);
		
		List<Animal> singeableAnimals = list.stream().filter(a -> a.getSingable() instanceof CanSing).collect(Collectors.toList());
		System.out.println("No of Animals who can sing : " +singeableAnimals.size());
		
	}
	
	@Test
	public void testAnimalCanFly() {
		Animal[] animal = new Animal[] {new Bird(new CanFly(), new CanSing()), 
										new Fish(new CannotSing(), new CanSwim(), new CannotWalk()),
										new Dolphine(new CanSwim(), new CanSing()),	
										new Duck(new CanFly(), new CanSing(), new Quack(), new CanSwim()),
										new Chicken(new CannotFly(), new CanSing(), new Cluck()),
										new Rooster(new CannotFly(), new CannotSing(), new CockADoo()),
										new Parrot(new CanFly(), new CanSing(), new Woof()),
										new Shark(new CannotSing(), new CanSwim(), new CannotWalk()),
										new ClownFish(new CannotSing(), new CanSwim(), new CannotWalk()),
										new Butterfly(new CanFly(), new NoSound())};
		
		
		List<Animal> list = Arrays.asList(animal);
		
		List<Animal> flyableAnimals = list.stream().filter(a -> a.getflFlyable() instanceof CanFly).collect(Collectors.toList());
		System.out.println("No of Animals who can fly : " + flyableAnimals.size());
		
	}
	
	@Test
	public void testAnimalCanWalk() {
		Animal[] animal = new Animal[] {new Bird(new CanFly(), new CanSing()), 
										new Fish(new CannotSing(), new CanSwim(), new CannotWalk()),
										new Dolphine(new CanSwim(), new CanSing()),	
										new Duck(new CanFly(), new CanSing(), new Quack(), new CanSwim()),
										new Chicken(new CannotFly(), new CanSing(), new Cluck()),
										new Rooster(new CannotFly(), new CannotSing(), new CockADoo()),
										new Parrot(new CanFly(), new CanSing(), new Woof()),
										new Shark(new CannotSing(), new CanSwim(), new CannotWalk()),
										new ClownFish(new CannotSing(), new CanSwim(), new CannotWalk()),
										new Butterfly(new CanFly(), new NoSound())};
		
		
		List<Animal> list = Arrays.asList(animal);
		
		List<Animal> walkableAnimals = list.stream().filter(a -> a.getWalkable() instanceof CanWalk).collect(Collectors.toList());
		System.out.println("No of Animals who can walk : " + walkableAnimals.size());
		
		
	}
	
	@Test
	public void testAnimalCanSwim() {
		Animal[] animal = new Animal[] {new Bird(new CanFly(), new CanSing()), 
										new Fish(new CannotSing(), new CanSwim(), new CannotWalk()),
										new Dolphine(new CanSwim(), new CanSing()),	
										new Duck(new CanFly(), new CanSing(), new Quack(), new CanSwim()),
										new Chicken(new CannotFly(), new CanSing(), new Cluck()),
										new Rooster(new CannotFly(), new CannotSing(), new CockADoo()),
										new Parrot(new CanFly(), new CanSing(), new Woof()),
										new Shark(new CannotSing(), new CanSwim(), new CannotWalk()),
										new ClownFish(new CannotSing(), new CanSwim(), new CannotWalk()),
										new Butterfly(new CanFly(), new NoSound())};
		
		
		List<Animal> list = Arrays.asList(animal);
		
		List<Animal> swimmableAnimals = list.stream().filter(a -> a.getSwimmable() instanceof CanSwim).collect(Collectors.toList());
		System.out.println("No of Animals who can swim : " + swimmableAnimals.size());
		
		
	}

}
