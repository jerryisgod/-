package com.ispan.eeit69.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Repository;

import com.ispan.eeit69.dao.CartDao;

import com.ispan.eeit69.dao.accountBalanceDao;
import com.ispan.eeit69.model.Cart;

import com.ispan.eeit69.model.accountBalance;
@Repository
public class accountBalanceDaoImpl implements accountBalanceDao {

//	SessionFactory factory;
	@PersistenceContext
	EntityManager  entityManager;   // session

	@Override
	public List<accountBalance> findAllaccountBalance() {

		String sql = "SELECT c FROM accountBalance c WHERE userId=8";
//		String sql = "SELECT cartId,u.username,i.itemname,i.itemprice,i.itemPicture\r\n"
//				+ "FROM cart c\r\n"
//				+ "JOIN user u ON c.userId = u.id\r\n"
//				+ "JOIN items i ON c.itemId = i.id ";
	
		List<accountBalance>  accountBalance = entityManager.createQuery(sql, accountBalance.class)
				                                 .getResultList();
		return accountBalance;
	}
	@Override
	public accountBalance findById(Integer userId) {
		String sql =  "SELECT a FROM accountBalance a WHERE a.userId = :userId";
	    TypedQuery<accountBalance> query = entityManager.createQuery(
	        sql, accountBalance.class);
	    query.setParameter("userId", userId);
	    List<accountBalance> results = query.getResultList();
	    if (!results.isEmpty()) {
	        return results.get(0);  // 如果有多個結果，取第一個（理論上應該只有一個）
	    }
	    return null;
	}


	    @Override
	    public void saveOrUpdate(accountBalance accountBalance) {
	        entityManager.merge(accountBalance);
	    }
	    @Override
	    public void addPointsToUser(Integer userId, Integer pointsToAdd) {
	        // 先查找用戶的餘額
	        accountBalance userAccountBalance = findById(userId);
	        
	        if (userAccountBalance != null) {
	            // 如果找到就增加點數
	            userAccountBalance.setCurrentAccountBalance(userAccountBalance.getCurrentAccountBalance() + pointsToAdd);
	           
	            // 保存更新后的账户余额
	            saveOrUpdate(userAccountBalance);
	        }
	    }



	    
	    
	    
	}
