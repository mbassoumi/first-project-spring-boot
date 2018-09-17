package com.in28minutes.service;

import org.springframework.stereotype.Component;

//spring to manage this beans and create an instance of this 
@Component
public class WelcomeService {
	public String retrieveWelcomeMessage() {
		return "fuck you man hhhh";
	}
}