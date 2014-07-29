package com.searchforit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SearchController {
	String displayText = "Test";

	@RequestMapping("/search")
	public ModelAndView search() {

		/*
		 * return a ModelAndView object taking the viewName, modelName and model
		 * Object
		 */
		return new ModelAndView("search", "displayText", displayText);
	}
}
