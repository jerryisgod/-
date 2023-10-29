	package com.example.ECPayDemo.service;
	
	import java.text.SimpleDateFormat;
	import java.util.Date;
	import java.util.UUID;
	
	import org.springframework.stereotype.Service;
	import org.springframework.core.ParameterizedTypeReference;
	import org.springframework.http.HttpMethod;
	import org.springframework.http.ResponseEntity;
	import ecpay.payment.integration.AllInOne;
	import ecpay.payment.integration.domain.AioCheckOutALL;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.web.client.RestTemplate;
	import java.util.List;
	import org.slf4j.Logger;
	import org.slf4j.LoggerFactory;
	
	
	
	import org.springframework.web.bind.annotation.ModelAttribute;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RequestMethod;
	import org.springframework.web.bind.annotation.RequestParam;
	
	import com.ispan.eeit69.model.Cart;
	import com.ispan.eeit69.model.accountBalance;
	import com.ispan.eeit69.service.CartService;
	import com.ispan.eeit69.service.accountBalanceService;
	@Service
	public class OrderService {
		@Autowired
	    private RestTemplate restTemplate;
		private static final Logger logger = LoggerFactory.getLogger(OrderService.class);

		public String ecpayCheckout() {
			 // 調用A專案的API來取得購物車資料
			 ParameterizedTypeReference<List<Cart>> typeRef = new ParameterizedTypeReference<List<Cart>>() {};
			    ResponseEntity<List<Cart>> responseEntity = restTemplate.exchange("http://localhost:8080/api/cart", HttpMethod.GET, null, typeRef);
			    List<Cart> cartList = responseEntity.getBody();
			String uuId = UUID.randomUUID().toString().replaceAll("-", "").substring(0, 20);
			
			Date currentTime = new Date();
	        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	        String formattedTime = sdf.format(currentTime);
	
	        // 根據取得的購物車資料來計算總金額和商品名稱等
	        int totalAmount = 0;
	        StringBuilder itemNames = new StringBuilder();
	        for (Cart cart : cartList) {
	            totalAmount += cart.getPrice();
	            itemNames.append(cart.getItemId()).append(",");
	        }
			AllInOne all = new AllInOne("");
			
			AioCheckOutALL obj = new AioCheckOutALL();
			obj.setMerchantTradeNo(uuId);
			obj.setMerchantTradeDate(formattedTime);
			obj.setTotalAmount(String.valueOf(totalAmount));
			obj.setTradeDesc("5teamtest Description");
			obj.setItemName("您目前已購買CS:GO"+itemNames.toString());
	//		obj.setReturnURL("http://211.23.128.214:5000");
			obj.setReturnURL("http://localhost:8081/paysuccess");
			obj.setNeedExtraPaidInfo("N");
			obj.setOrderResultURL("http://localhost:8081/paysuccess");
			obj.setClientBackURL("http://localhost:8080");
			String form = all.aioCheckOut(obj, null);
			
			return form;
		}
	
		@RequestMapping(value = "/ecpayCheckoutPoints", method = RequestMethod.POST)
		public String ecpayCheckoutForPoints(@RequestParam("points") int points) {
			// 調用A專案的API來取得購物車資料
					 ParameterizedTypeReference<List<Cart>> typeRef = new ParameterizedTypeReference<List<Cart>>() {};
					    ResponseEntity<List<Cart>> responseEntity = restTemplate.exchange("http://localhost:8080/api/cart", HttpMethod.GET, null, typeRef);
					    List<Cart> cartList = responseEntity.getBody();
					String uuId = UUID.randomUUID().toString().replaceAll("-", "").substring(0, 20);
					
					Date currentTime = new Date();
			        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
			        String formattedTime = sdf.format(currentTime);
	
			       
					AllInOne all = new AllInOne("");
					
					AioCheckOutALL obj = new AioCheckOutALL();
					obj.setMerchantTradeNo(uuId);
					obj.setMerchantTradeDate(formattedTime);
					obj.setTotalAmount(Integer.toString(points));
					obj.setTradeDesc("5teamtest Description");
					obj.setItemName("您目前已購買"+Integer.toString(points)+"點數");
					//obj.setReturnURL("http://211.23.128.214:5000");
					obj.setReturnURL("http://localhost:8080/pointpaysucces");
					obj.setNeedExtraPaidInfo("N");
					//obj.setOrderResultURL("http://localhost:8080/pointpaysucces");
					obj.setClientBackURL("http://localhost:8080");
					String form = all.aioCheckOut(obj, null);
					
					return form;
		}
		
		
		
		
	}
