package com.devsuperior.services;

import com.devsuperior.entities.Order;

public class DiscountService {

public double dsct(Order order) {
return (order.getDiscount() / 100) * order.getBasic();
}

}
