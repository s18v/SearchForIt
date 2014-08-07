package com.searchforit.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SearchController {
	String displayText = "Search the inventory for anything you like!";

	@RequestMapping(value = "/search", method = RequestMethod.GET)
	public ModelAndView handleSearch() {

		/*
		 * return a ModelAndView object taking the viewName, modelName and model
		 * Object
		 */
		System.out.println("Logging entry into search method!");

		ModelAndView modelAndView = new ModelAndView("search");
		modelAndView.addObject("displayText", displayText);

		return modelAndView;
	}

	// @RequestMapping(value = "/search", method = RequestMethod.GET)
	// public ModelAndView handleSearch(
	// @RequestParam(value = "searchQuery", required = false) String
	// searchQuery) {
	//
	// System.out.println("trying to get the search query");
	//
	// return new ModelAndView("search", "searchQuery", searchQuery);
	// }

}

// public static class TestClass {
// public String testString;
//
// TestClass(String testString){
// this.testString =testString;
// }
// public String getTestString() {
// return testString;
// }
// public void setTestString(String testString) {
// this.testString = testString;
// }
//
// }
