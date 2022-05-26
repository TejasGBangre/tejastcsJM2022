package w.cart.repository;



import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import w.cart.entity.Order;

@Repository
public interface OrderRepository extends MongoRepository<Order, Long> {

}
