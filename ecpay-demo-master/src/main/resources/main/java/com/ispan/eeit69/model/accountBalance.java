package com.ispan.eeit69.model;

import java.io.Serializable;
import java.sql.Clob;
import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.ispan.eeit69.utils.SystemService;
@Entity
@Table(name="accountBalance")
public class accountBalance implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private Integer balanceId;
    private Integer  userId; 
    private Integer  currentAccountBalance;

    
	public accountBalance() {
		super();
	}

	public accountBalance(Integer balanceId, Integer  userId, Integer  currentAccountBalance) {
		super();
		this.balanceId = balanceId;
		this.userId = userId;
		this.currentAccountBalance = currentAccountBalance;
		
		
	}

	public Integer getBalanceId() {
		return balanceId;
	}

	public void setBalanceId(Integer balanceId) {
		this.balanceId = balanceId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getCurrentAccountBalance() {
		return currentAccountBalance;
	}

	public void setCurrentAccountBalance(Integer currentAccountBalance) {
		this.currentAccountBalance = currentAccountBalance;
	}

	@Override
	public String toString() {
		return "accountBalance [balanceId=" + balanceId + ", userId=" + userId + ", currentAccountBalance="
				+ currentAccountBalance + "]";
	}

	


	
	

	


    
    
}
