package com.stuartmathews.controllers;
 
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

 
@Controller
@RequestMapping( value="/products" )
public class ProductController { 
		
	/* Default get method */
	@RequestMapping(method = RequestMethod.GET)
	public String get(ModelMap model) throws Exception
	{		
		ArrayList<DAL.DEL.Product> products = DAL.Product.getAllProducts();
		model.addAttribute("products", products);
		return "Products";
 
	}
	
	
	// Show add product Form
	@RequestMapping(value ="/create", method = RequestMethod.POST)
	public String addProductToDB(DAL.DEL.Product product, ModelMap model) throws Exception
	{		
		DAL.Product.addProduct( product );
		return get(model);
 
	}
	@RequestMapping( value="/add", method = RequestMethod.GET)
	public String addProductForm( ModelMap map ){
		return "AddProduct";
	}
	@RequestMapping( value="/delete/{productID}", method = RequestMethod.GET)
	public String deleteProductByID( @PathVariable("productID") String productID, ModelMap model) throws Exception
	{
		DAL.Product.deleteProductByID( productID );
		return get(model);
	}
	
}