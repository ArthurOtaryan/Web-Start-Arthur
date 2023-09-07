package com.smartcode.web.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class User {

    private Integer id;

    private String name;

    private String lastName;

    private String middleName;

    private String username;

    private Integer age;

    private String password;

    private BigDecimal balance;


}
