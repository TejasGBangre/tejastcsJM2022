package w.cart.serviceimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import w.cart.entity.Order;
import w.cart.repository.OrderRepository;
import w.cart.service.OrderService;

public class OrderServiceImp implements OrderService {
	
	@Autowired
	OrderRepository ordeRepository;

	
	public void save(Order order) {
		 ordeRepository.insert(order);
 
		
	}

	@Override
	public List<Order> findAll() {
		return ordeRepository.findAll();
		
	}

	@Override
	public void deleteById(long id) {
		ordeRepository.deleteById(id);
		
	}


	

	
}
