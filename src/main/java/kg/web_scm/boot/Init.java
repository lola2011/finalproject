package kg.web_scm.boot;

import kg.web_scm.entity.User;
import kg.web_scm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class Init implements CommandLineRunner {
    @Autowired
    private UserService userService;
    @Override
    public void run(String... args) throws Exception {
//userService.create(new User("lena_25","123445",1));
    }

}
