package com.ispan.eeit69.dao;

import java.util.List;

import com.ispan.eeit69.model.Cart;
import com.ispan.eeit69.model.accountBalance;

public interface accountBalanceDao {
	
	List<accountBalance> findAllaccountBalance();
	
	// 根據用戶ID查找賬戶餘額
		accountBalance findById(Integer userId);
		
		// 更新或保存賬戶餘額
		void saveOrUpdate(accountBalance accountBalance);

		 void addPointsToUser(Integer userId, Integer pointsToAdd);

		
}
