package kg.web_scm.service;

import kg.web_scm.entity.Product;
import kg.web_scm.entity.Supplier;
import kg.web_scm.model.SupplierModel;

import java.util.List;

public interface SupplierService {
    List<Supplier> getAll();

    List<Supplier> getAllByProduct(Product product);


    List<Supplier> getAllByLeadTimeBefore(Integer leadTime);

    Supplier getById(Long id);

    Supplier create(SupplierModel supplierModel);

    Supplier update(Supplier supplier);

    Supplier deleteById(Long id);
}
