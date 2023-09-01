package com.smartcode.web.controller;

import com.smartcode.web.model.User;
import com.smartcode.web.repository.user.UserRepository;
import com.smartcode.web.repository.user.impl.UserRepositoryImpl;
import com.smartcode.web.service.user.UserService;
import com.smartcode.web.service.user.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.math.BigDecimal;
import java.sql.SQLException;

public class RegisterServlet extends HttpServlet {
private final UserRepository UserRepository = new UserRepositoryImpl();
private final UserService UserService = new UserServiceImpl(UserRepository);

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String lastName = req.getParameter("lastName");
        String middle_name = req.getParameter("middle_Name");
        Integer age = Integer.valueOf(req.getParameter("age"));
        String username = req.getParameter("username");
        String password = req.getParameter("password");


        User user = new User(null,name,lastName,middle_name,username,age,password,new BigDecimal(0));
        try {
            UserService.register(user);
            resp.sendRedirect("login.html");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }



    }
}




