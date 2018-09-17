package com.in28minutes.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.service.WelcomeService;

@RestController
public class WeelcomeController {

	/**
	 * when we used @Autowired here and @component above the WelcomeService its
	 * equal to private WelcomeService service= new WelcomeService();
	 * 
	 * Dependency : welcome controller depends on welcome service to get its logics
	 */
	@Autowired // this injected service with welcomeService component (dependency injection)
	private WelcomeService service;

	@RequestMapping("/welcome")
	public String welcome() {
		return service.retrieveWelcomeMessage();
	}

}
