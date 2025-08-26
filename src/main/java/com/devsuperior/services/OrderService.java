package com.devsuperior.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.entities.Order;

@Service
public class OrderService {

@Autowired
private DiscountService discountService = new DiscountService();

    public double total(Order order){
        return order.getBasic() - discountService.dsct(order.getDiscount(), order.getBasic());
    }
}
