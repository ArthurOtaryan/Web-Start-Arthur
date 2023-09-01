package com.smartcode.web.repository.user;

import com.smartcode.web.model.User;

import java.sql.SQLException;
import java.util.List;

public interface UserRepository {
    User create(User user);

    void update(User user);

    List<User> getAll();

    boolean usernameExists(String username);

    User getById(Integer id);

    void delete(Integer id);

    List<User> findByName(String string);

    void deleteAll() throws SQLException;

    void deleteById(int userId) throws SQLException;
}
