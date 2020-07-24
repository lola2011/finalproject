package kg.web_scm.service;


import kg.web_scm.entity.User;

import java.util.List;
public interface UserService {
    List<User> getAll();
    User getById(Long id);
    User create (User user);
 User update(User user);
 User deleteById(Long id);

}
