package kg.web_scm.service;

import kg.web_scm.entity.Order;

import java.util.List;

public interface OrderService {
    List<Order> getAll();
    Order create(Order order);
    Order getById(Long id);
    Order update(Order order);
    Order deleteById(Long id);
}
