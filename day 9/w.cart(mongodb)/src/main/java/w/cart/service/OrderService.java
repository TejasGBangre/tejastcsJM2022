package w.cart.service;

import java.util.List;

import w.cart.entity.Order;

public interface OrderService {
	
	void save(Order order);

	List<Order> findAll();

	void deleteById(long id);

}
