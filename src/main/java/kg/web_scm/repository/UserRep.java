package kg.web_scm.repository;

import kg.web_scm.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRep extends JpaRepository <User,Long> {

}
