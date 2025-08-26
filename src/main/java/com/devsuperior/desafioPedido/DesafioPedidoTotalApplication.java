package com.devsuperior.desafioPedido;

import java.util.Locale;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.devsuperior.entities.Order;
import com.devsuperior.services.OrderService;

@SpringBootApplication
public class DesafioPedidoTotalApplication {

		
	public static void main(String[] args) {

		SpringApplication.run(DesafioPedidoTotalApplication.class, args);
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		int code = scan.nextInt();
		double basic = scan.nextDouble();
		double discount = scan.nextDouble();

		Order order = new Order(code, basic, discount);
		OrderService orderService = new OrderService();

		System.out.println("Total: " + orderService.total(order));

		scan.close();

	}

}
