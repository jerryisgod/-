package com.ispan.eeit69.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ispan.eeit69.dao.CartDao;
import com.ispan.eeit69.dao.accountBalanceDao;
import com.ispan.eeit69.model.Cart;
import com.ispan.eeit69.model.accountBalance;
import com.ispan.eeit69.service.CartService;
import com.ispan.eeit69.service.accountBalanceService;

@Service
@Transactional
public class accountBalanceServiceImpl implements accountBalanceService {
	@Autowired
	accountBalanceDao accountBalanceDao;
	

	public accountBalanceServiceImpl(accountBalanceDao accountBalanceDao) {
		this.accountBalanceDao = accountBalanceDao;
	}

@Override
public List<accountBalance> findAllaccountBalanceService() {
	return accountBalanceDao.findAllaccountBalance();
}

@Override
public boolean updateAccountBalance(Integer userId, Integer newBalance) {
    try {
        accountBalance balance = accountBalanceDao.findById(userId);
        if (balance != null) {
            balance.setCurrentAccountBalance(newBalance);
            accountBalanceDao.saveOrUpdate(balance);
            return true;
        } else {
            return false;
        }
    } catch (Exception e) {
        e.printStackTrace();
        return false;
    }
}

@Override
public void addPointsToUser(Integer userId, Integer pointsToAdd) {
    accountBalanceDao.addPointsToUser(userId, pointsToAdd);
}
}








