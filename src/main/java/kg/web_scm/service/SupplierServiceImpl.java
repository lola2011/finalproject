package kg.web_scm.service;

import kg.web_scm.entity.Product;
import kg.web_scm.entity.Supplier;
import kg.web_scm.model.SupplierModel;
import kg.web_scm.repository.SupplierRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SupplierServiceImpl implements SupplierService {
    @Autowired
    private SupplierRep supplierRep;
@Autowired
private ProductService productService;
    @Override
    public List<Supplier> getAll() {
        return supplierRep.findAll();
    }

    @Override
    public List<Supplier> getAllByProduct(Product product) {
        return supplierRep.findAllByProduct(product);
    }


    @Override
    public List<Supplier> getAllByLeadTimeBefore(Integer leadTime) {
        return supplierRep.findAllByLeadTimeBefore(leadTime);
    }

    @Override
    public Supplier getById(Long id) {
        return supplierRep.findById(id).orElse(null);
    }

    @Override
    public Supplier create(SupplierModel supplierModel) {

        Product product=(Product) productService.getById(supplierModel.getProductId());
        if(product==null)
            return null;
        Supplier supplier= new Supplier();
        supplier.setLeadTime(supplierModel.getLeadTime());
        supplier.setSupplierName(supplierModel.getSupplierName());
        supplier.setProduct(product);
        return supplierRep.save(supplier);

    }
    @Override
    public Supplier update(Supplier supplier) {
        return supplierRep.save(supplier);
    }

    @Override
    public Supplier deleteById(Long id) {
        Supplier supplier = getById(id);
        if (supplier != null) {
            supplierRep.deleteById(id);
        }
        return supplier;
    }
}