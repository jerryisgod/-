package com.ispan.eeit69.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Repository;

import com.ispan.eeit69.dao.CartDao;
import com.ispan.eeit69.model.Cart;
@Repository
public class CartDaoImpl implements CartDao {

//	SessionFactory factory;
	@PersistenceContext
	EntityManager  entityManager;   // session

	@Override
	public List<Cart> findAllCart() {
		//String sql = "SELECT c FROM Cart c JOIN FETCH c.user WHERE c.user.id = 8";
		String sql = "SELECT c FROM Cart c WHERE userId=8 ";
//		String sql = "SELECT cartId,u.username,i.itemname,i.itemprice,i.itemPicture\r\n"
//				+ "FROM cart c\r\n"
//				+ "JOIN user u ON c.userId = u.id\r\n"
//				+ "JOIN items i ON c.itemId = i.id ";
		List<Cart>  cart = entityManager.createQuery(sql, Cart.class)
				                                 .getResultList();
		return cart;
		
	}
	 @Override
	    public void deleteCartItem(Integer cartId) {
	        // 删除购物车中指定 cartId 的商品
	        Cart cartItem = entityManager.find(Cart.class, cartId);
	        if (cartItem != null) {
	            entityManager.remove(cartItem);
	        }
	    }
	 @Override
	 public void deleteByUserId(Integer userId) {
	     // 創建 JPQL DELETE 語句
	     String sql = "DELETE FROM Cart c WHERE c.userId = :userId";
	     
	     // 使用 EntityManager 來執行 JPQL 語句
	     int deletedCount = entityManager.createQuery(sql)
	                                     .setParameter("userId", userId)
	                                     .executeUpdate();
	     
	     // 檢查是否有數據被刪除
	     if (deletedCount > 0) {
	         System.out.println("已成功清空用戶ID為 " + userId + " 的購物車");
	     } else {
	         System.out.println("用戶ID為 " + userId + " 的購物車是空的");
	     }
	 }
	
	



}
