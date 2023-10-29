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
@Table(name="cart")
public class Cart implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private Integer cartId;
    private Integer  userId; 
    private String  itemId;
    private Integer quantity;
    private Integer  price;
    
    @JsonIgnore
    private Clob    picture;
    @Transient
    private String image;
    @Autowired
	public Cart() {
		super();
	}

	public Cart(Integer cartId, Integer  userId, String  itemId, 
			Integer quantity ,Integer  price, Clob picture
	) {
		super();
		this.cartId = cartId;
		this.userId = userId;
		this.itemId = itemId;
		this.quantity = quantity;
		this.price = price;
		this.picture = picture;
		
		
	}

	public Integer getCartId() {
		return cartId;
	}

	public void setCartId(Integer cartId) {
		this.cartId = cartId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Clob getPicture() {
		return picture;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getDataUri() throws Exception {
		return SystemService.clobToString(picture);
	}

	public void setPicture(Clob picture) {
		this.picture = picture;
	}

	@Override
	public String toString() {
		return "Cart [cartId=" + cartId + ", userId=" + userId + ", itemId=" + itemId + ", quantity=" + quantity
				+ ", price=" + price + ", picture=" + picture + "]";
	}


	
	

	


    
    
}
