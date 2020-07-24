package kg.web_scm.service;

import kg.web_scm.entity.Inventory;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

public interface InventoryService {
    List<Inventory> getAll();

    Inventory getById(Long id);

    Inventory create(Inventory inventory);

    Inventory update(Inventory inventory);

    Inventory deleteById(Long id);}