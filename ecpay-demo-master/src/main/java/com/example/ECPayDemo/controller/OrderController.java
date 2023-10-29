package com.example.ECPayDemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.example.ECPayDemo.service.OrderService;

@RestController
public class OrderController {
	
	@Autowired
	OrderService orderService;

	@GetMapping("/ecpayCheckout")
	public String ecpayCheckout() {
		String aioCheckOutALLForm = orderService.ecpayCheckout();
		
		return aioCheckOutALLForm;
	}
	@GetMapping("/ecpayCheckoutPoints")
	public String ecpayCheckoutPoints(@RequestParam("points") int points) {
		String aioCheckOutPointsForm = orderService.ecpayCheckoutForPoints(points);
		
		return aioCheckOutPointsForm;
	}
	
	
	

	
	
}
