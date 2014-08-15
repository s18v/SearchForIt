package com.searchforit.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SearchController {
	String displayText = "Search";

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

	@RequestMapping(value = "/searchqueryresult", method = { RequestMethod.GET,
			RequestMethod.POST })
	// Map<String, Object>
	public @ResponseBody Map<String, Object> handleSearchQuery(
			@RequestParam(value = "searchquery", required = false) String searchQuery) {
		System.out.println("Logging the search query - " + searchQuery);
		String result = "You have this as a result of the search query";

		Map<String, Object> map = new HashMap<String, Object>();

		map.put("result", result);
		
		return map;
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

