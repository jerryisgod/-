package com.ispan.eeit69.controller;

import java.sql.Clob;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;

import javax.sql.rowset.serial.SerialClob;
import javax.sql.rowset.serial.SerialException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ispan.eeit69.model.Cart;
import com.ispan.eeit69.model.accountBalance;
import com.ispan.eeit69.service.CartService;
import com.ispan.eeit69.service.accountBalanceService;


@RestController
public class CartApiController {

    private final CartService cartService;

    public CartApiController(CartService cartService) {
        this.cartService = cartService;
    }

    @GetMapping("/api/cart")
    public List<Cart> getCartData() {
        return cartService.findAllCart();
    }
}
