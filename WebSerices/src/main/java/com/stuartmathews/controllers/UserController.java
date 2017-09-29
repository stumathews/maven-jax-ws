package com.stuartmathews.controllers;
 
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.stuartmathews.forms.AddUserForm;
 
@Controller
@RequestMapping( value="/user" )
public class UserController {
 
	//default get method
	@RequestMapping( method = RequestMethod.GET)
	public String get(ModelMap model)
	{
		model.addAttribute("message","This is the user page");
		return "User";
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String addUser() { 
		return "AddUser"; 
	}
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String listUsers(ModelMap model) throws Exception
	{
		ArrayList<DAL.DEL.User> users = DAL.User.getAllUsers();
		model.addAttribute("users", users);
		return "ShowUsers";
	}
	
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public String createUser(AddUserForm form, ModelMap model) throws Exception {
		String username = form.getUsername();
		String password = form.getPassword();
		DAL.User.createUser(username, password);
		return listUsers(model);
 
	}
	@RequestMapping(value = "/delete/{user}", method = RequestMethod.GET)
	public String deleteUser( @PathVariable("user") String username, ModelMap model) throws Exception
	{
		DAL.User.deleteUser(username);
		return listUsers(model);
	}
	
 
}

