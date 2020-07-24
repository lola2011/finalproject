package kg.web_scm.controller;

import kg.web_scm.entity.UserRole;
import kg.web_scm.model.UserRoleModel;
import kg.web_scm.service.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user-role")
public class UserRoleController {

  @Autowired
    private UserRoleService userRoleService;
  @GetMapping
    public List<UserRole> getAll(){
      return userRoleService.findAll();
  }
@PostMapping
    public UserRole create(@RequestBody UserRoleModel userRoleModel){
      return userRoleService.create(userRoleModel);
}
@PostMapping("/old")
    public UserRole create(@RequestBody UserRole userRole){
      return userRoleService.create(userRole);
}
}
