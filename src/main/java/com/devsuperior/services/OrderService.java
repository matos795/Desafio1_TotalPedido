package com.devsuperior.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.entities.Order;

@Service
public class OrderService {

@Autowired
private DiscountService discountService = new DiscountService();
@Autowired
private ShippingService shippingService = new ShippingService();

    public double total(Order order){
        return discountService.dsct(order) + shippingService.shipment(order);
    }
}
