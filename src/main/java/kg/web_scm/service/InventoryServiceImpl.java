package kg.web_scm.service;

import kg.web_scm.entity.Inventory;
import kg.web_scm.entity.OrderPurchase;
import kg.web_scm.repository.InventoryRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class InventoryServiceImpl implements InventoryService {
@Autowired
private InventoryRep inventoryRep;

    @Override
    public List<Inventory> getAll() {
        return inventoryRep.findAll();
    }

    @Override
    public Inventory getById(Long id) {
        return inventoryRep.findById(id).orElse(null);
    }

    @Override
    public Inventory create(Inventory inventory) {
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

    /*public Inventory recount() {
        Integer n = orderPurchase.getQuantity();
        Integer i = inventory.getProductQuantity();
        if (orderPurchase.getQuantity() == n){
            inventory.setProductQuantity(i - n);

    }
        return inventory;*/
    }
