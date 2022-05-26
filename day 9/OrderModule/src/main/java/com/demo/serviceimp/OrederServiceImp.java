package com.demo.serviceimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.demo.entity.Order;
import com.demo.repository.OrderRepository;
import com.demo.service.OrderService;

public class OrederServiceImp implements OrderService {

	@Autowired
	OrderRepository orderRepository;
	@Override
	public Order saveOrder(Order order) {
		Order ord = orderRepository.save(order);
		return ord;		
	}

	@Override
	public Order updateOrder(Order order, Long id) {
		return orderRepository.save(order);
		
	}

	@Override
	public List<Order> getOrderList() {
		return orderRepository.findAll();
	}

	@Override
	public void deleteOrderById(Long id) {
		orderRepository.deleteById(id);		
	}

}
