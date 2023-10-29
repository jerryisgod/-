package com.ispan.eeit69.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ispan.eeit69.model.Cart;
import com.ispan.eeit69.service.accountBalanceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@Controller
public class topUpController {
	@Autowired
	private accountBalanceService accountBalanceService;
	
	 @GetMapping("/topup")  
	  public String showtopup() {
	   
	      return "topup";  
	  }
	 
	 @RequestMapping(value = "/pointpaysucces", method = RequestMethod.POST, consumes = "application/json")
	 public String pointPaymentSuccess(@RequestBody Map<String, Object> payload) {
		 Integer points = (Integer) payload.get("points");
		 Integer userId = (Integer) payload.get("userId");
		 accountBalanceService.addPointsToUser(userId, points);
	     System.out.println(points+":"+userId);
	     return "pointok"; // 
	 }
	  

}
