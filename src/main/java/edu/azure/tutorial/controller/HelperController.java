package edu.azure.tutorial.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/helper")
class HelperController {

	@GetMapping("/hello-world")
   public String hello() {
		return "Hello I'm Alive. ";
	}
}