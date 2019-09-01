package com.home.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

public class Soncontroller {
	

	@Controller
	public class Momcontroller {
		@ResponseBody
		@RequestMapping("/water")
		public String giveWater()
		{
			return "OK,your  water by Son";
		}
		

	}


}
