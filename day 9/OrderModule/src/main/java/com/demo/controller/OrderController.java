package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.Order;
import com.demo.service.OrderService;



@RestController
public class OrderController {
	
	@Autowired
	OrderService orderService;
	
	@PutMapping(value = "/addorder")
public Order addOrder(@RequestBody Order order) {
		
	return	orderService.saveOrder(order);
	}
	
	@GetMapping(value = "/vieworder")
	public List<Order> viewStudentList(){
		
		return orderService.getOrderList();
	}
	
	@PutMapping(value = "/updateorder/{id}")
	public Order updateOrder(@RequestBody Order order, @PathVariable("id") Long id) {
		
		return orderService.updateOrder(order, id);
	}
	
	@DeleteMapping(value = "/deleteorder/{id}")
	public String deleteOrderById(@PathVariable("id") Long id) {
		
		orderService.deleteOrderById(id);
		return "Deleted Successfully";
	}
		

}
