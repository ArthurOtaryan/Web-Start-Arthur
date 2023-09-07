package com.smartcode.web.controller;

import com.smartcode.web.exception.ValidationException;
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

public class LoginServlet extends HttpServlet {
private final UserRepository UserRepository = new UserRepositoryImpl();
private final UserService UserService = new UserServiceImpl(UserRepository);

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        try{
        String username = req.getParameter("username");
        String password = req.getParameter("password");



            UserService.login(username,password);
            req.getSession().setAttribute("username",username);
            req.getSession().setAttribute("id", UserRepository.getByUsername(username).getId());
            req.getSession().setMaxInactiveInterval(3600);
            req.getRequestDispatcher("home.jsp").forward(req,resp);

        }catch(ValidationException e){

            req.setAttribute("message",e.getMessage());
            req.getRequestDispatcher("login.jsp").forward(req,resp);
        }

        }



}




