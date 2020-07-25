package kg.web_scm.controller;

import kg.web_scm.entity.Sales;
import kg.web_scm.model.SaleModel;
import kg.web_scm.service.SalesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/sales")
public class SalesController {

    @Autowired
    private SalesService salesService;

    @GetMapping
    public List<Sales> getAll() {
        return salesService.getAll();

    }

    @GetMapping("/{id}")
    public Sales getById(@PathVariable Long id) {
        return salesService.getById(id);

    }

    @PostMapping
    public Sales create(@RequestBody SaleModel saleModel) {
        return salesService.create(saleModel);
    }

    @PutMapping
    public Sales update(@RequestBody Sales sales) {
        return salesService.update(sales);
    }

    @DeleteMapping("/{id}")
    public Sales deleteById(@PathVariable Long id) {
        return salesService.deleteById(id);
    }
}

