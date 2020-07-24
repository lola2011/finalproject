package kg.web_scm.repository;

import kg.web_scm.entity.OrderPurchase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderPurchaseRep extends JpaRepository<OrderPurchase,Long> {
}
