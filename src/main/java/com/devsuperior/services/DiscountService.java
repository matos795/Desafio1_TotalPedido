package com.devsuperior.services;

import org.springframework.stereotype.Service;

import com.devsuperior.entities.Order;

@Service
public class DiscountService {

public double dsct(Order order) {
return order.getBasic() - ((order.getDiscount() / 100) * order.getBasic());
}

}
