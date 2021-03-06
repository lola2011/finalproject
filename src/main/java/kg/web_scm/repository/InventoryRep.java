package kg.web_scm.repository;

import kg.web_scm.entity.Inventory;
import kg.web_scm.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InventoryRep extends JpaRepository<Inventory,Long> {


    Inventory findInventoryByProductId(Long id);
}
