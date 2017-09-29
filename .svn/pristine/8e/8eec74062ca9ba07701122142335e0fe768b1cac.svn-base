package com.stuartmathews.controllers;
 
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
 
@Controller
@RequestMapping(value="/test")
public class TestController { 
		
	// default get method
	@RequestMapping( method = RequestMethod.GET)
	public String printTestPage(ModelMap model) throws Exception
	{		
		model.addAttribute("tokens", DAL.Token.GetAllTokens());
		return "Test";
 
	}
	
	/*
	 * The URI Template "/owners/{yourName}" specifies
	 *  the variable name yourName.
	 *   When the controller handles this request, the value 
	 *   of yourName is set to the value in the request URI. 
	 *   For example, when a request comes in for /yourName/fred, 
	 *   the value fred is bound to the method parameter String yourName.
	 *   NB: Debugging needs to be compiled into your code to use this
	 * */		
	@RequestMapping(value="/myNameIs/{yourName}", method=RequestMethod.GET)
	public String printYourName(@PathVariable("yourName") String yourName, Model model) {
		model.addAttribute("yourName", yourName);  
		  return "DisplayName"; 
	}
	
	@RequestMapping(value = "/myNameIs", method = RequestMethod.GET)
	  public String printYourName(@RequestParam("yourName") String yourName, @RequestParam("yourSurname") String yourSurname,  Model model) { 
		model.addAttribute("yourName", yourName);
		model.addAttribute("yourSurname", yourSurname); 
		return "DisplayName";
	  }
	@RequestMapping(value = "/formexample", method = RequestMethod.GET)
	  public String printForm(  Model model) { 
		
		return "formexample";
	  }
 
}