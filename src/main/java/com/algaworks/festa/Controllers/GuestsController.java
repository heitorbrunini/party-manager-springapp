package com.algaworks.festa.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.algaworks.festa.Repsitories.FirstGuestRepository;
import com.algaworks.festa.model.entities.FirstGuest;

@RestController
@RequestMapping ("/Guests")
public class GuestsController {
	@Autowired
	FirstGuestRepository repository;
	
	@GetMapping
	public ModelAndView getGuests() {
		ModelAndView modelAndView = new ModelAndView("view");
		modelAndView.addObject("guests", repository.findAll());
		modelAndView.addObject("FirstGuest",new FirstGuest());
		return modelAndView;
	}
	
	@PostMapping
	public ModelAndView save(FirstGuest guest) {
		repository.save(guest);		
		return new ModelAndView("redirect:/Guests");
	}

	
}
