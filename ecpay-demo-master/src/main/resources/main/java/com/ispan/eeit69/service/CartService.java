package com.ispan.eeit69.service;

import java.util.List;


import com.ispan.eeit69.model.Cart;


public interface CartService {
	List<Cart> findAllCart();
	void deleteCartItem(Integer cartId);

	// 新增的方法
    void clearCartForUser(Integer userId);
	
	
	
	
}
