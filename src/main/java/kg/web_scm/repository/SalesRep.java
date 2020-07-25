package kg.web_scm.repository;

import kg.web_scm.entity.Sales;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalesRep extends JpaRepository<Sales,Long> {
}
