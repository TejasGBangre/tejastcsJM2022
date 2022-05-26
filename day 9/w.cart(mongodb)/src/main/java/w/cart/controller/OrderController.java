package w.cart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import w.cart.entity.Order;
import w.cart.service.OrderService;


public class OrderController {
	
	@Autowired
	OrderService orderService;
	

    @PostMapping("/addOrder")
    public String saveOrder(@RequestBody Order order){
    	orderService.save(order);
        
        return "Added Successfully";
    }
  
    @GetMapping("/findAllOrder")
    public List<Order> getOrders() {
        
        return orderService.findAll();
    }
  
    @DeleteMapping("/delete/{id}")
    public String deleteOrder(@PathVariable long id){
    	orderService.deleteById(id);
        
        return "Deleted Successfully";
    }

}
