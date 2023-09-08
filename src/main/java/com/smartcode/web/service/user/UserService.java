package com.smartcode.web.service.user;

import com.smartcode.web.model.User;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.List;

public interface UserService {

    void transfer(User from, User to, BigDecimal amount) throws SQLException;

  void register(User user) throws SQLException;

    void update(User user) throws SQLException;

    User getById(int userId) throws SQLException;

    void deleteAll() throws SQLException;

    void deleteById(int userId) throws SQLException;

    List<User> getAll() throws SQLException;


    void login(String username, String password);
  boolean changePassword(User user, String oldPassword, String newPassword);

}
