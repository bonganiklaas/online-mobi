/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abdul.onlinemobi.services;

import com.abdul.onlinemobi.domain.OrderItem;
import java.util.List;

/**
 *
 * @author BKLAAS1
 */
public interface OrderService {
    public List<OrderItem> getOrderItems();
    
}
