package kg.web_scm.service;

import kg.web_scm.entity.User;
import kg.web_scm.repository.UserRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private  UserRep userRep;
@Autowired
private PasswordEncoder passwordEncoder;
    @Override
    public List<User> getAll() {
        return userRep.findAll();
    }

    @Override
    public User getById(Long id) {
        return userRep.findById(id).orElse(null);
    }

    @Override
    public User create(User user) {
        String encodedPassword= passwordEncoder.encode(user.getPassword());
        user.setPassword(encodedPassword);
        return  userRep.save(user);
    }

    @Override
    public User update(User user) {
        return userRep.save(user);
    }

    @Override
    public User deleteById(Long id) {
        User user= getById(id);
        if (user!=null)
        {userRep.deleteById(id);
    } return user;
}}
