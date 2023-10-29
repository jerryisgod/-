package com.ispan.eeit69.controller;

import java.sql.Clob;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;
import java.util.Map;

import javax.sql.rowset.serial.SerialClob;
import javax.sql.rowset.serial.SerialException;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.ispan.eeit69.model.Cart;
import com.ispan.eeit69.model.accountBalance;
import com.ispan.eeit69.service.CartService;
import com.ispan.eeit69.service.accountBalanceService;

@Controller
public class FindCartController {
    
	  private CartService cartService;
	  private accountBalanceService accountBalanceService; // 注入 accountBalanceService
	
	
	
//	@Autowired
	  public FindCartController(CartService cartService, accountBalanceService accountBalanceService) {
	        this.cartService = cartService;
	        this.accountBalanceService = accountBalanceService;
	    }

	//顯示購物車內容
	@GetMapping("cart")
	public String findAllcart(Model model) {
		//獲取購物車資訊
		List<Cart>  cart = cartService.findAllCart();
		// 獲取餘額
		List<accountBalance> accountBalances = accountBalanceService.findAllaccountBalanceService(); 
		double totalPrice = calculateTotalPrice(cart); // 計算總價格
		model.addAttribute("cart",cart);
		model.addAttribute("totalPrice", totalPrice);
		model.addAttribute("accountBalances", accountBalances);
		System.out.println(cart);
		System.out.println(accountBalances);
//		model.addAttribute("employeeList", employees);
		return "cart";    // /WEB-INF/views/showAllEmployees.jsp
	}
	 // 計算總價格
    private double calculateTotalPrice(List<Cart> cartItems) {
        double totalPrice = 0.0;
        for (Cart cartItem : cartItems) {
            totalPrice += cartItem.getPrice();
        }
        return totalPrice;
    }
    
 // 購物車刪除button
    @PostMapping("/deleteCartItem")
    public String deleteCartItem(@RequestParam("cartItemId") Integer cartId) {
        cartService.deleteCartItem(cartId);
        return "redirect:/cart";
    }

//清除購物車
    @PostMapping("/clearCart")
    public ResponseEntity<String> clearCart(@RequestBody Map<String, String> payload) {
        String userIdStr = payload.get("userId");
        Integer userId = Integer.parseInt(userIdStr);  // 將字串轉換為整數
        cartService.clearCartForUser(userId);
        return ResponseEntity.ok("Cart cleared");
    }

}

