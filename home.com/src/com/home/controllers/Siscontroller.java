package com.home.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Siscontroller {
	@ResponseBody
	@RequestMapping("milk")
public String giveMilk()
{
	return "take milk from sister";
}
}
