package kg.web_scm.controller;

import kg.web_scm.entity.Order;
import kg.web_scm.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/order")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @PostMapping
    public Order create(@RequestBody Order order) {
        return orderService.create(order);
    }

    @GetMapping
    public List<Order> getAll(){
        return orderService.getAll();
    }
}
