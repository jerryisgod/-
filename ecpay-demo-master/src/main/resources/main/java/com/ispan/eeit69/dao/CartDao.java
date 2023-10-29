package com.ispan.eeit69.dao;

import java.util.List;

import com.ispan.eeit69.model.Cart;


public interface CartDao {
	List<Cart> findAllCart();
	void deleteCartItem(Integer cartId);
	 // 新增的方法
    void deleteByUserId(Integer userId);
	
	
}
