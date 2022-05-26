package com.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.demo.entity.Order;

@Service
public interface OrderService {
	
	
	Order saveOrder(Order order);
	
	Order updateOrder(Order order,Long id);

	List<Order> getOrderList();

	void deleteOrderById(Long id);

}
