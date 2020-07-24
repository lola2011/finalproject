package kg.web_scm.service;

import kg.web_scm.entity.Inventory;
import kg.web_scm.model.InventoryModel;

import java.util.List;

public interface InventoryService {
    List<Inventory> getAll();

    Inventory getById(Long id);

    Inventory create(InventoryModel inventoryModel);

    Inventory update(Inventory inventory);

    Inventory deleteById(Long id);

Inventory getInventoryByProduct(Long id);
}