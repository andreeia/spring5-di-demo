package guru.springframework.didemo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import guru.springframework.didemo.services.GreetingService;

@Controller
public class PropertyInjectedController {
	//public GreetingServiceImplementation
	//example of what NOT TO DO!!
	@Autowired
	public GreetingService greetingServiceImpl;
	
	public String sayHello() {
		return greetingServiceImpl.sayGreeting();
	}
	
}
