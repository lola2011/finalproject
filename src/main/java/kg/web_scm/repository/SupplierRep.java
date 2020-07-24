package kg.web_scm.repository;

import kg.web_scm.entity.Product;
import kg.web_scm.entity.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SupplierRep extends JpaRepository<Supplier,Long> {
List<Supplier> findAllByLeadTimeBefore(Integer leadTime);
List<Supplier> findAllByProduct(Product product);
}
