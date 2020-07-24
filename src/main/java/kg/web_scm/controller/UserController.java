package kg.web_scm.controller;

import kg.web_scm.entity.User;
import kg.web_scm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    private UserService userService;

@GetMapping

    public List<User> getAll(){
    return userService.getAll();
}
@GetMapping("/{id}")
    public User getById(@PathVariable Long id){
    return  userService.getById(id);

}
@PostMapping
    public User create (@RequestBody User user){
    return userService.create(user);
}
@PutMapping
    public User update(@ RequestBody User user){
    return userService.update(user);
}
@DeleteMapping("/{id}")
    public User deleteById(@PathVariable Long id){
    return userService.deleteById(id);
}
}
