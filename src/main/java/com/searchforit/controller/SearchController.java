package com.searchforit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SearchController {
	String displayText = "Search the inventory for anything you like!";

	// @RequestMapping(value = "/search", method = RequestMethod.GET)
	// public ModelAndView search() {
	//
	// /*
	// * return a ModelAndView object taking the viewName, modelName and model
	// * Object
	// */
	// System.out.println("Logging the Search Controller entry!");
	// return new ModelAndView("search", "displayText", displayText);
	// }

	@RequestMapping(value = "/search", method = RequestMethod.GET)
	public ModelAndView handleSearch(
			@RequestParam(value = "searchQuery", required = false) String searchQuery) {

		System.out.println("trying to get the search query");

		return new ModelAndView("search", "searchQuery", searchQuery);
	}

}
