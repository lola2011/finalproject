package kg.web_scm.service;

import kg.web_scm.entity.Inventory;
import kg.web_scm.entity.Sales;
import kg.web_scm.entity.Product;
import kg.web_scm.model.SaleModel;
import kg.web_scm.repository.InventoryRep;
import kg.web_scm.repository.ProductRep;
import kg.web_scm.repository.SalesRep;
import kg.web_scm.repository.UserRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class SalesServiceImpl implements SalesService {
    @Autowired
    private SalesRep salesRep;

    @Autowired
    private ProductRep productRep;

    @Autowired
    private InventoryRep inventoryRep;

    @Autowired
    private UserRep userRep;

    @Override
    public List<Sales> getAll() {
        return salesRep.findAll();
    }

    @Override
    public Sales getById(Long id) {
        return salesRep.findById(id).orElse(null);
    }

    @Override
    public Sales create(SaleModel saleModel) {
        Long productId = saleModel.getProductId();
        Inventory inventory = inventoryRep.findInventoryByProductId(productId);
        if (inventory.getProductQuantity() - saleModel.getProductQuantity() >= 0) {
            inventory.setProductQuantity(inventory.getProductQuantity() - saleModel.getProductQuantity());
            inventoryRep.save(inventory);
        }
        Long userId = saleModel.getUserId();
        Product product = new Product();
        Sales sales = new Sales();
        sales.setProduct(productRep.findById(productId).orElse(null));
        sales.setQuantity(saleModel.getProductQuantity());
        sales.setOrderDate(LocalDateTime.now());
        sales.setSum(saleModel.getProductQuantity() * product.getPrice());
        sales.setUser(userRep.findById(userId).orElse(null));
        return salesRep.save(sales);
    }

    @Override
    public Sales update(Sales sales) {
        return salesRep.save(sales);
    }

    @Override
    public Sales deleteById(Long id) {
        Sales sales = getById(id);
        if (sales != null) {
            salesRep.deleteById(id);
        }
        return sales;
    }
}
