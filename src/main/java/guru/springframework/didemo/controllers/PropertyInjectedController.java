package guru.springframework.didemo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import guru.springframework.didemo.services.GreetingServiceImpl;

@Controller
public class PropertyInjectedController {
	//public GreetingServiceImplementation
	//example of what NOT TO DO!!
	@Autowired
	public GreetingServiceImpl greetingService;
	
	public String sayHello() {
		return greetingService.sayGreeting();
	}
	
}
