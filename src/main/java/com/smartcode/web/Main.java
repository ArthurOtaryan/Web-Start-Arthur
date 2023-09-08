package com.smartcode.web;

import com.smartcode.web.repository.user.UserRepository;
import com.smartcode.web.repository.user.impl.UserRepositoryJDBCImpl;
import com.smartcode.web.service.user.UserService;
import com.smartcode.web.service.user.impl.UserServiceImpl;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        UserRepository userRepository = new UserRepositoryJDBCImpl();
        UserService userService = new UserServiceImpl(userRepository);


      /* User user1 = new User();
        user1.setName("Alice");
        user1.setLastName("Johnson");
        user1.setMiddleName("Marie");
        user1.setAge(28);
        user1.setUsername("alicej");
        user1.setPassword("alicepassword");
        user1.setBalance(new BigDecimal("1500.00"));
        userRepository.create(user1);

        User user2 = new User();
        user2.setName("Bob");
        user2.setLastName("Smith");
        user2.setMiddleName("Edward");
        user2.setAge(32);
        user2.setUsername("bobsmith");
        user2.setPassword("bobpassword");
        user2.setBalance(new BigDecimal("2000.00"));
        userRepository.create(user2);

        User user3 = new User();
        user3.setName("Eve");
        user3.setLastName("White");
        user3.setMiddleName("Grace");
        user3.setAge(25);
        user3.setUsername("evewhite");
        user3.setPassword("evepassword");
        user3.setBalance(new BigDecimal("800.00"));
        userRepository.create(user3);*/


      /*  User userToUpdate = userRepository.getById(1);
        userToUpdate.setName("UpdatedName");
        userRepository.update(userToUpdate);


        List<User> allUsers = userRepository.getAll();
        for (User user : allUsers) {
            System.out.println(user.getName());
        }


        User foundUser = userRepository.getById(1);
        System.out.println("Found user: " + foundUser.getName());


       // userRepository.delete(1);


       List<User> usersByName = userRepository.findByName("Bob");
        for (User user : usersByName) {
            System.out.println(user.getName());
        }*/
        /*User user1 = new User();
        user1.setName("Alice");
        user1.setLastName("Johnson");
        user1.setMiddleName("Marie");
        user1.setAge(28);
        user1.setUsername("alicej");
        user1.setPassword("alicepassword");
        user1.setBalance(new BigDecimal("1500.00"));
        userService.register(user1);

        User user2 = new User();
        user2.setName("Alice");
        user2.setLastName("Johnson");
        user2.setMiddleName("Marie");
        user2.setAge(28);
        user2.setUsername("alice");
        user2.setPassword("alicepassword");
        user2.setBalance(new BigDecimal("1500.00"));
        userService.register(user2);*/

       /* User user2 = new User();
        user2.setName("Bob");
        userService.register(user2);

        User user3 = new User();
        user3.setName("Eve");
        userService.register(user3);*/


        /*User userToUpdate = userService.getById(1);
        userToUpdate.setName("Laura");
        userService.update(userToUpdate);*/

       /* List<User> allUsers = userService.getAll();
        for (User user : allUsers) {
            System.out.println(user.getName());
        }

        User foundUser = userService.getById(1);
        System.out.println("Found user: " + foundUser.getName());

        userService.deleteById(1);
        //userService.deleteAll();

        User eve = userRepository.getById(3);
        User bob = userRepository.getById(2);
        userService.transfer(eve, bob, new BigDecimal(200));*/

        }

    }
