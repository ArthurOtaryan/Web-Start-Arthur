package com.smartcode.web.model;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
@Column(nullable = false)
    private String name;
    @Column(name="last_name",nullable = false)
    private String lastName;
    @Column(name="middle_name")
    private String middleName;
@Column(nullable = false,unique = true)
    private String username;
    @Column(nullable = false)
    private Integer age;
    @Column(nullable = false)
    private String password;
    @Column(nullable = false)
    private BigDecimal balance;


}
