package kg.web_scm.service;

import kg.web_scm.entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAll();

    Product getById(Long id);

    Product create(Product product);

    Product update(Product product);

    Product deleteById(Long id);
}
