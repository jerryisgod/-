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
@Table(name="orderDetails")
public class OrderDetails implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private Integer orderId;
    private Integer  tradeNo; 	
    private Integer  userId;
    private Date  orderDate;
    private Date  totalAmount;

    
	public OrderDetails() {
		super();
	}


	



	


	
	

	


    
    
}
