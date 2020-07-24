package kg.web_scm.service;

import kg.web_scm.entity.Inventory;
import kg.web_scm.entity.OrderPurchase;
import kg.web_scm.entity.Product;
import kg.web_scm.model.PurchaseModel;
import kg.web_scm.repository.InventoryRep;
import kg.web_scm.repository.OrderPurchaseRep;
import kg.web_scm.repository.ProductRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
@Service
public class OrderPurchaseServiceImpl implements OrderPurchaseService {
    @Autowired
    private OrderPurchaseRep orderPurchaseRep;

    @Autowired
    private ProductRep productRep;

    @Autowired
    private InventoryRep inventoryRep;


    @Override
    public List<OrderPurchase> getAll() {
        return orderPurchaseRep.findAll();
    }

    @Override
    public OrderPurchase getById(Long id) {
        return orderPurchaseRep.findById(id).orElse(null);
    }

    @Override
    public OrderPurchase create(PurchaseModel purchaseModel) {

        Long productId =purchaseModel.getProductId();
        Inventory inventory = inventoryRep.findInventoryByProductId(productId);
        if(inventory.getProductQuantity()-purchaseModel.getProductQuantity()>=0){
            inventory.setProductQuantity(inventory.getProductQuantity()-purchaseModel.getProductQuantity());
            inventoryRep.save(inventory);
        }
        OrderPurchase orderPurchase= new OrderPurchase();
        orderPurchase.setProduct(productRep.findById(productId).orElse(null));
        orderPurchase.setQuantity(purchaseModel.getProductQuantity());
        orderPurchase.setDueDate(LocalDateTime.now());
        orderPurchase.setOrderDate(LocalDateTime.now());
        orderPurchase.setSum(purchaseModel.getProductQuantity()*inventory.getCost());
        return orderPurchaseRep.save(orderPurchase);
    }

    @Override
    public OrderPurchase update(OrderPurchase orderPurchase) {
        return orderPurchaseRep.save(orderPurchase);
    }

    @Override
    public OrderPurchase deleteById(Long id) {
        OrderPurchase orderPurchase=getById(id);
        if(orderPurchase!=null){
            orderPurchaseRep.deleteById(id);
        }
        return orderPurchase;
    }
}
