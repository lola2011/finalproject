package kg.web_scm.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name="customer_user")
public class User {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        @Column(name="name", nullable = false)
        private String name;
        @Column(name = "surname",nullable = false)
        private String surname;
        @Column(name = "login", nullable = false, unique = true)
        private String login;
        @Column(name = "password", nullable = false)
        private String password;
        @Column(name="address",nullable=false)
        private String address;
        @Column(name="email",nullable = false)
        private String mail;
        @Column(name="mobile",nullable = false)
        private Integer mobile;
        @Column(name="is_active",nullable = false)
        private Integer isActive;


    }

