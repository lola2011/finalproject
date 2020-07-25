package kg.web_scm.service;

import kg.web_scm.entity.Inventory;
import kg.web_scm.entity.Order;
import kg.web_scm.entity.Supplier;
import kg.web_scm.repository.InventoryRep;
import kg.web_scm.repository.OrderRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderRep orderRep;
    @Autowired
    private InventoryRep inventoryRep;
    @Autowired
    private SupplierService supplierService;
    @Override
    public List<Order> getAll() {
        return orderRep.findAll();
    }

    @Override
    public Order create(Order order) {
        Inventory inventory = inventoryRep.findInventoryByProductId(order.getProduct().getId());
        Supplier  supplier = supplierService.getById(order.getSupplier().getId());

        if(inventory.getProductQuantity()<=supplier.getLeadTime()*10){
            orderRep.save(order);
        }
        return orderRep.save(order);
    }

    @Override
    public Order getById(Long id) {
        return null;
    }

    @Override
    public Order update(Order order) {
        return null;
    }

    @Override
    public Order deleteById(Long id) {
        return null;
    }
}
