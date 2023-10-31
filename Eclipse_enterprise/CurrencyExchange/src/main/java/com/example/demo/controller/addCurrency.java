package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.Entities.Currency;

@Controller
public class addCurrency {
	
	@PostMapping("/addCurrency")
	public String addCurrency(@RequestParam String code, @RequestParam double exchangeRate) {
	    // Create a new Currency object and save it to the database
	    Currency currency = new Currency();
	    currency.setCode(code);
	    currency.setExchangeRate(exchangeRate);
	    currencyRepository.save(currency);

	    // Redirect back to the "currency" page or any other page as needed
	    return "redirect:/currency";
	}

}
