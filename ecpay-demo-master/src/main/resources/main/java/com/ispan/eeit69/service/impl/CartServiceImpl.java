package com.ispan.eeit69.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ispan.eeit69.dao.CartDao;

import com.ispan.eeit69.model.Cart;

import com.ispan.eeit69.service.CartService;


@Service
@Transactional
public class CartServiceImpl implements CartService {

	CartDao cartDao;
	
//	@Autowired
	public CartServiceImpl(CartDao cartDao) {
		this.cartDao = cartDao;
	}

	
	@Override
	public List<Cart> findAllCart() {
		return cartDao.findAllCart();
	}
	 @Override
	    public void deleteCartItem(Integer cartId) {
	      
	        cartDao.deleteCartItem(cartId);
	    }
	 
	 // 新增的方法實現
	    @Override
	    public void clearCartForUser(Integer userId) {
	        cartDao.deleteByUserId(userId);
	    }
}
