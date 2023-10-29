package com.example.ECPayDemo.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;
import java.util.List;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import com.ispan.eeit69.model.Cart;
import com.ispan.eeit69.service.accountBalanceService;
import org.springframework.web.client.RestTemplate;

@Controller
public class PaymentSuccessController {
	private accountBalanceService accountBalanceService; // 注入 accountBalanceService
    @Autowired
    private RestTemplate restTemplate;  // 注入 RestTemplate

    @PostMapping("/paysuccess")
    public String cardPaymentSuccess(Model model) {
        // 調用A專案的API來抓資料
        ParameterizedTypeReference<List<Cart>> typeRef = new ParameterizedTypeReference<List<Cart>>() {};
        ResponseEntity<List<Cart>> responseEntity = restTemplate.exchange("http://localhost:8080/api/cart", HttpMethod.GET, null, typeRef);
        List<Cart> cartList = responseEntity.getBody();

        // 產生隨機碼
        String uuId = UUID.randomUUID().toString().replaceAll("-", "").substring(0, 10);
        
        // 獲取當前時間
        Date currentTime = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        String formattedTime = sdf.format(currentTime);

        // 計算總價
        int totalAmount = 0;
        StringBuilder itemNames = new StringBuilder();
        Integer user = null;
		for (Cart cart : cartList) {
            totalAmount += cart.getPrice();
            itemNames.append(cart.getItemId()).append(", ");
            user = cart.getUserId();
        }

        // +Model
        model.addAttribute("merchantTradeNo", "5team"+uuId);
        model.addAttribute("merchantTradeDate", formattedTime);
        model.addAttribute("user", user);
        model.addAttribute("totalAmount", totalAmount);
        model.addAttribute("itemName",itemNames.toString());

        return "cardok";  
    }
//    @PostMapping("/pointpaysuccess")
//    public String addPointsToUser() {
//        return "pointok";
//    }


}
    


    
