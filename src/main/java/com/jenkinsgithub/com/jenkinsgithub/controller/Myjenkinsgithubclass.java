package com.jenkinsgithub.com.jenkinsgithub.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Myjenkinsgithubclass {
	
	
  @RequestMapping("/hellojenkins")
	public String hellojenkins()
	{
		return "Hello Jenkins";
	}

}
