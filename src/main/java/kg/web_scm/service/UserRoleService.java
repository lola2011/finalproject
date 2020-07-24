package kg.web_scm.service;

import kg.web_scm.entity.UserRole;
import kg.web_scm.model.UserRoleModel;

import java.util.List;

public interface UserRoleService {
    List<UserRole> findAll();
    UserRole create(UserRoleModel userRoleModel);
    UserRole create(UserRole userRole);
}
