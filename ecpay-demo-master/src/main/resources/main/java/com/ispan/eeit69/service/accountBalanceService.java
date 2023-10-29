package com.ispan.eeit69.service;

import java.util.List;

import com.ispan.eeit69.model.accountBalance;


public interface accountBalanceService {
	
	List<accountBalance> findAllaccountBalanceService();
	
	// 新增一個方法來更新賬戶餘額
		boolean updateAccountBalance(Integer userId, Integer newBalance);
	//儲值點數方法
		void addPointsToUser(Integer userId, Integer pointsToAdd);
	

	
	
	
	
}
