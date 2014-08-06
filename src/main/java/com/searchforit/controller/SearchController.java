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

	TestClass testObj = new TestClass("Search the inventory");
	
	
	 @RequestMapping(value = "/search", method = RequestMethod.GET)
	 public ModelAndView search() {
	
		 System.out.println(testObj.getTestString());
	 /*
	 * return a ModelAndView object taking the viewName, modelName and model
	 * Object
	 */
	 System.out.println("Logging the Search Controller entry!");
	 ModelAndView modelAndView = new ModelAndView("search");
	 
	 Map<String,String> obj = new HashMap<String,String>();
	 obj.put("testString","my test string");
	 
	 modelAndView.addObject("testObj", testObj);
	
	 return modelAndView;
	 }

	public  static class TestClass {
			public String testString;
			
			TestClass(String testString){
				this.testString =testString; 
			}
			public String getTestString() {
				return testString;
			}
			public void setTestString(String testString) {
				this.testString = testString;
			}
			
		}
//	@RequestMapping(value = "/search", method = RequestMethod.GET)
//	public ModelAndView handleSearch(
//			@RequestParam(value = "searchQuery", required = false) String searchQuery) {
//
//		System.out.println("trying to get the search query");
//
//		return new ModelAndView("search", "searchQuery", searchQuery);
//	}

}

