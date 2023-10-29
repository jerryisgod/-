package com.ispan.eeit69.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ispan.eeit69.dao.OrderDao;

@Service
public class OrderService {
    
    @Autowired
    private OrderDao orderDao;

    public void saveOrder(Map<String, Object> payload) {
//        存訂單
        orderDao.saveOrder(payload);
    }
    public void savegame(Map<String, Object> payload) {
//      存訂單
      orderDao.savegame(payload);
  }
}
