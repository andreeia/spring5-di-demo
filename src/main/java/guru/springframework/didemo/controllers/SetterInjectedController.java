package guru.springframework.didemo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import guru.springframework.didemo.services.GreetingService;
import guru.springframework.didemo.services.GreetingServiceImpl;

@Controller
public class SetterInjectedController {

	private GreetingService greetingService;
	
	public String sayHello() {
		return greetingService.sayGreeting();
	}
	@Autowired
	public void setGreetingService(GreetingServiceImpl greetingService) {
		this.greetingService = greetingService;
	}
}
