package com.foodrecipe.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class StartController {
	@RequestMapping("/index")
	public String index() {
//		List<Food> list = fooddao.getAllRecipies();
//		return new ModelAndView("index", "list", list);
		return "index";
	}


}
