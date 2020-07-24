package kg.web_scm.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name="customer_user")
public class User {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        @Column(name="name")
        private String name;
        @Column(name = "surname")
        private String surname;
        @Column(name = "login", nullable = false, unique = true)
        private String login;
        @Column(name = "password", nullable = false)
        private String password;
        @Column(name="address")
        private String address;
        @Column(name="email")
        private String mail;
        @Column(name="mobile")
        private Integer mobile;
        @Column(name="is_active",nullable = false)
        private Integer isActive;

        public User(String login,String password,Integer isActive) {
                this.login = login;
                this.password=password;
                this.isActive=isActive;
        }
//@ManyToMany
        //@JoinTable(name = "user_roles",joinColumns = {@JoinColumn(name = "id")},inverseJoinColumns = {@JoinColumn(name = "role_id")})
        //private List<UserRole> roles;

    }

