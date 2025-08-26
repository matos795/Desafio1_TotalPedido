package com.devsuperior.services;

import org.springframework.stereotype.Service;

@Service
public class DiscountService {

public double dsct(double discount, double amount) {
return (discount / 100) * amount;
}

}
