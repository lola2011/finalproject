package kg.web_scm.repository;

import kg.web_scm.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRep extends JpaRepository<Order,Long> {
}
