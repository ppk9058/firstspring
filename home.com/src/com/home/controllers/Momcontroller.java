package com.home.controllers;

//import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Momcontroller {
	@ResponseBody
	@RequestMapping("/sugar")
	public String giveSugar()
	{
		return "OK,your sugar";
	}
	

}
