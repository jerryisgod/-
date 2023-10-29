package com.ispan.eeit69.controller;

import java.sql.Clob;

import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;
import java.util.Map;

import javax.sql.rowset.serial.SerialClob;
import javax.sql.rowset.serial.SerialException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ispan.eeit69.model.Cart;
import com.ispan.eeit69.model.accountBalance;
import com.ispan.eeit69.service.CartService;
import com.ispan.eeit69.service.OrderService;
import com.ispan.eeit69.service.accountBalanceService;
@Controller
@CrossOrigin(origins = "http://localhost:8081")
public class OrderController {
	 
	  private CartService cartService;
	  private accountBalanceService accountBalanceService; // 注入 accountBalanceService
	  @Autowired
	  private OrderService orderService; // 注入OrderService
//		@Autowired
	  public OrderController(CartService cartService, accountBalanceService accountBalanceService) {
		    this.cartService = cartService;
		    this.accountBalanceService = accountBalanceService;
		}
	
//	
	// 顯示訂單內容
	  @GetMapping("/order")  // 
	  public String showOrder(Model model) {
	      List<Cart> cart = cartService.findAllCart();
	   // 獲取餘額
			List<accountBalance> accountBalances = accountBalanceService.findAllaccountBalanceService(); 
	      double totalPrice = calculateTotalPrice(cart);
	      model.addAttribute("cart", cart);
	      model.addAttribute("totalPrice", totalPrice);
	      model.addAttribute("accountBalances", accountBalances);
	      return "order";  
	  }

	  // 計算總價格
	  private double calculateTotalPrice(List<Cart> cartItems) {
	      double totalPrice = 0.0;
	      for (Cart cartItem : cartItems) {
	          totalPrice += cartItem.getPrice();
	      }
	      return totalPrice;
	  }
	  @PostMapping("/updatePoints")
	    public ResponseEntity<String> updatePoints(@RequestBody Map<String, Integer> payload) {
	        Integer newBalance = payload.get("newBalance");
	        Integer userId = payload.get("userId");
	        System.out.println("Received new balance: " + newBalance + " for user ID: " + userId);
	        // 更新資料庫中的點數
	        updatePointsInDatabase(userId, newBalance);
	        
	        return ResponseEntity.ok("{\"message\": \"點數已更新\"}");
	    }

	  private void updatePointsInDatabase(Integer userId, Integer newBalance) {
		    // 調用服務層的方法來更新資料庫中的店屬
		    accountBalanceService.updateAccountBalance(userId, newBalance);
		}
	  // 允許來自第三方支付專案的跨域請求
	    @CrossOrigin(origins = "http://localhost:8081")
	    @RequestMapping(value = "/saveOrder", method = RequestMethod.POST, consumes = "application/json")
	    public String saveOrder(@RequestBody Map<String, Object> payload) {
	        
	        //獲取需要的參樹
	        String merchantTradeNo = (String) payload.get("merchantTradeNo");
	        String merchantTradeDate = (String) payload.get("merchantTradeDate");
	        String userId = (String) payload.get("userId");
	        String totalAmount = (String) payload.get("totalAmount");
	        String itemName = (String) payload.get("itemName");
	        
	        System.out.println(merchantTradeNo);
	        System.out.println(merchantTradeDate);
	        System.out.println(userId);
	        System.out.println(totalAmount);
	        System.out.println(itemName);
	        //訂單存入資料庫
	        orderService.saveOrder(payload);
	        //商品存入資料庫
	        orderService.savegame(payload);
	        
	        
	        return "ok";
	    }
	  
	  
	  
 
}
