package kg.web_scm.service;

import kg.web_scm.entity.UserRole;
import kg.web_scm.model.UserRoleModel;
import kg.web_scm.repository.UserRoleRep;
import kg.web_scm.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserRoleServiceImpl implements UserRoleService {
    @Autowired
    private UserRoleRep userRoleRep;
    @Autowired
    private UserService userService;
    @Override
    public List<UserRole> findAll() {
        return userRoleRep.findAll();
    }

    @Override
    public UserRole create(UserRoleModel userRoleModel) {
      User user= userService.getById(userRoleModel.getUserId());
       if(user==null)
       return null;
       UserRole userRole=new UserRole();
       userRole.setRoleName(userRoleModel.getRoleName());
       userRole.setUser(user);
       return userRoleRep.save(userRole);
    }

    @Override
    public UserRole create(UserRole userRole) {
        return userRoleRep.save(userRole);
    }
}
