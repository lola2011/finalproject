package kg.web_scm.repository;

import kg.web_scm.entity.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRoleRep extends JpaRepository<UserRole,Long> {
}
