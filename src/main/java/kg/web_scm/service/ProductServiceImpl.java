package kg.web_scm.service;

import kg.web_scm.entity.Inventory;
import kg.web_scm.entity.Product;
import kg.web_scm.repository.InventoryRep;
import kg.web_scm.repository.ProductRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
   private ProductRep productRep;
    @Autowired
    private InventoryRep inventoryRep;
    @Override
    public List<Product> getAll() {
        return productRep.findAll();
    }

    @Override
    public Product getById(Long id) {
        return productRep.findById(id).orElse(null);
    }

    @Override
    public Product create(Product product) {


        Product productSaved = productRep.save(product);

        Inventory inventory=new Inventory();
        inventory.setProduct(productSaved);
        //productRep.findBy;
        inventory.setProductQuantity(50);
        inventory.setCost(50);
        inventoryRep.save(inventory);
        return productSaved;
    }

    @Override
    public Product update(Product product) {
        return productRep.save(product);
    }

    @Override
    public Product deleteById(Long id) {
        Product product=getById(id);
        if(product!=null){
            productRep.deleteById(id);}
        return product;

}}
