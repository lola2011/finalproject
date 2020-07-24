package kg.web_scm.service;

import kg.web_scm.entity.Product;
import kg.web_scm.repository.ProductRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
   private ProductRep productRep;
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
        return productRep.save(product);
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
