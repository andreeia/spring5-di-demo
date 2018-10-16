package guru.springframework.didemo.controllers;

import guru.springframework.didemo.services.GreetingService;
import guru.springframework.didemo.services.GreetingServiceImpl;

public class SetterInjectedController {

	private GreetingService greetingService;
	
	String sayHello() {
		return greetingService.sayGreeting();
	}
	public void setGreetingService(GreetingServiceImpl greetingService) {
		this.greetingService = greetingService;
	}
}
