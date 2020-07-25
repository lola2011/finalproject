package kg.web_scm.controller;

import kg.web_scm.entity.Product;
import kg.web_scm.entity.Supplier;
import kg.web_scm.model.SupplierModel;
import kg.web_scm.service.ProductService;
import kg.web_scm.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/supplier")
public class SupplierController {
    @Autowired
    private SupplierService supplierService;
    @Autowired
    private ProductService productService;

    @GetMapping
    public List<Supplier> getAll() {
        return supplierService.getAll();

    }

    @GetMapping("/{product}")
    public List<Supplier> getAllByProduct(@PathVariable Product product) {
        return supplierService.getAllByProduct(product);
    }

    @PostMapping
    public Supplier create(@RequestBody SupplierModel supplierModel) {
        return supplierService.create(supplierModel);
    }

@PutMapping
    public Supplier update(@RequestBody Supplier supplier){
        return supplierService.update(supplier);
}
@DeleteMapping("/{id}")
    public Supplier delete(@PathVariable Long id){
        return supplierService.deleteById(id);
}
}
