package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.model.Product;

@Controller
public class ProductController {
	@GetMapping("/display")
	public String displayProduct(Model model) {
		Product myprd=new Product(1,"Java",700);
		model.addAttribute("product", myprd);
		return "Product";
}
	@GetMapping("/displayList")
	public String displayProductList(Model model)
	{
		List<Product> prdList= new ArrayList<Product>();
		prdList.add(new Product(1,"Java", 870));
		prdList.add(new Product(1,"Hibernate", 1300));
		model.addAttribute("prdlist", prdList);
		return "displayList";

	}
}
