package com.example.demo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.singtel.test.animal.Animal;
import com.singtel.test.service.AnimalService;

@Controller
public class AnimalController {
	
	@RequestMapping(method = RequestMethod.GET, value = "/test/getname")
	@ResponseBody
	public List<Animal> getName() {
		AnimalService animalService = new AnimalService();
		return animalService.getAllAnimals();
	}
	
	@RequestMapping(method = RequestMethod.POST , value = "/getspecies")
	@ResponseBody
	public Animal getAnimalSpecies(@RequestParam(value="species") String species) {
		
		AnimalService animalService  = new AnimalService();
		return animalService.getSpecies(species);
	}

}
