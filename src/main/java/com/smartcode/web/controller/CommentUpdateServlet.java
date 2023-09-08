package com.smartcode.web.controller;

import com.smartcode.web.model.Comment;
import com.smartcode.web.repository.comment.CommentRepository;
import com.smartcode.web.repository.comment.impl.CommentRepositoryImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CommentUpdateServlet extends HttpServlet {

    CommentRepository commentRepository = new CommentRepositoryImpl();


    Comment comment = new Comment();

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {



        comment.setTitle((String) req.getSession().getAttribute("title"));

        comment.setDescription(req.getParameter("description"));

        comment.setUser_id((Integer) req.getSession().getAttribute("id"));

        commentRepository.edit(comment);
        req.getSession().removeAttribute("title");

        req.getRequestDispatcher("home.jsp").forward(req, resp);
    }
}
