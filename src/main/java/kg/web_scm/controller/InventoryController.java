package kg.web_scm.controller;

import kg.web_scm.entity.Inventory;
import kg.web_scm.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/inventory")
public class InventoryController {
    @Autowired
    private InventoryService inventoryService;

    @GetMapping
    public List<Inventory> getAll() {
        return inventoryService.getAll();

    }

    @GetMapping("/{id}")
    public Inventory getById(@PathVariable Long id) {
        return inventoryService.getById(id);

    }

    @PostMapping
    public Inventory create(@RequestBody Inventory inventory) {
        return inventoryService.create(inventory);
    }

    @PutMapping
    public Inventory update(@RequestBody Inventory inventory) {
        return inventoryService.update(inventory);
    }

    @DeleteMapping("/{id}")
    public Inventory deleteById(@PathVariable Long id) {
        return inventoryService.deleteById(id);
    }
}
