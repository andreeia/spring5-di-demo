package guru.springframework.didemo.controllers;

import guru.springframework.didemo.services.GreetingServiceImpl;

public class PropertyInjectedController {
	//public GreetingServiceImplementation
	//example of what NOT TO DO!!
	
	public GreetingServiceImpl greetingService;
	
	String sayHello() {
		return greetingService.sayGreeting();
	}
	
}
