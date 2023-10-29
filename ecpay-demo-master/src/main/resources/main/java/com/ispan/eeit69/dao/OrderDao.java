package com.ispan.eeit69.dao;

import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class OrderDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void saveOrder(Map<String, Object> payload) {
        String sql = "INSERT INTO orders (TradeNo, orderDate, userId, totalAmount, itemId) VALUES (?, ?, ?, ?, ?)";
        
        String[] itemIds = ((String) payload.get("itemName")).split(",");
        
        for (String itemId : itemIds) {
            itemId = itemId.trim();  // 去除前後空格
            if (!itemId.isEmpty()) {  // 檢查 itemId 是否為空
                jdbcTemplate.update(sql, 
                    payload.get("merchantTradeNo"), 
                    payload.get("merchantTradeDate"), 
                    payload.get("userId"), 
                    payload.get("totalAmount"), 
                    itemId
                );
            }
        }
    }


 public void savegame(Map<String, Object> payload) {
        
        String sql = "INSERT INTO player_Games_library (playerID, gameID) VALUES (?, ?)";
        
 String[] itemIds = ((String) payload.get("itemName")).split(",");
        
        for (String itemId : itemIds) {
            itemId = itemId.trim();  // 去除前後空格
            if (!itemId.isEmpty()) {  // 檢查 itemId 是否為空
                jdbcTemplate.update(sql, 
                    payload.get("userId"), 
                    itemId
                );
            }
        }
 }
}