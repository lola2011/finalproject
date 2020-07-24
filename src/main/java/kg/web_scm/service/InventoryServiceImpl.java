package kg.web_scm.service;

import kg.web_scm.entity.Inventory;
import kg.web_scm.entity.Product;
import kg.web_scm.model.InventoryModel;
import kg.web_scm.repository.InventoryRep;
import kg.web_scm.repository.ProductRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class InventoryServiceImpl implements InventoryService {
@Autowired
private InventoryRep inventoryRep;
@Autowired
private ProductRep productRepo;
    @Override
    public List<Inventory> getAll() {
        return inventoryRep.findAll();
    }

    @Override
    public Inventory getById(Long id) {
        return inventoryRep.findById(id).orElse(null);
    }

    @Override
    public Inventory create(InventoryModel inventoryModel) {
      Long productId= inventoryModel.getProductId();
       Product product = new Product();
      Inventory inventory=new Inventory();
      inventory.setProduct(productRepo.findById(productId).orElse(null));
      inventory.setCost(null);
      inventory.setProductQuantity(inventoryModel.getProductQuantity());
   return inventoryRep.save(inventory);
    }
    @Override
    public Inventory update(Inventory inventory) {
        return inventoryRep.save(inventory);
    }

    @Override
    public Inventory deleteById(Long id) {
        Inventory inventory=getById(id);
        if(inventory!=null){
            inventoryRep.deleteById(id);
        }
    return inventory;
    }

    @Override
    public Inventory getInventoryByProduct(Long id) {
        return inventoryRep.findInventoryByProductId(id);
    }

    }
