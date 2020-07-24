package kg.web_scm.controller;

import kg.web_scm.entity.OrderPurchase;
import kg.web_scm.model.PurchaseModel;
import kg.web_scm.service.OrderPurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/order-purchase")
public class OrderPurchaseController  {

    @Autowired
    private OrderPurchaseService orderPurchaseService;

    @GetMapping
    public List<OrderPurchase> getAll() {
        return orderPurchaseService.getAll();

    }

    @GetMapping("/{id}")
    public OrderPurchase getById(@PathVariable Long id) {
        return orderPurchaseService.getById(id);

    }

    @PostMapping
    public OrderPurchase create(@RequestBody PurchaseModel purchaseModel) {
        return orderPurchaseService.create(purchaseModel);
    }

    @PutMapping
    public OrderPurchase update(@RequestBody OrderPurchase orderPurchase) {
        return orderPurchaseService.update(orderPurchase);
    }

    @DeleteMapping("/{id}")
    public OrderPurchase deleteById(@PathVariable Long id) {
        return orderPurchaseService.deleteById(id);
    }
}

