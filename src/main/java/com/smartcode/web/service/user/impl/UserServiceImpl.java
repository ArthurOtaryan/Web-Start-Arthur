package com.smartcode.web.service.user.impl;

import com.smartcode.web.model.User;
import com.smartcode.web.repository.user.UserRepository;
import com.smartcode.web.service.user.UserService;
import com.smartcode.web.utils.DataSource;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    private final Connection connection = DataSource.getInstance().getConnection();

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public void transfer(User from, User to, BigDecimal amount) throws SQLException {
        try {
            connection.setAutoCommit(false);
            from.setBalance(from.getBalance().subtract(amount));
            to.setBalance(to.getBalance().add(amount));
            userRepository.update(from);
            userRepository.update(to);
            connection.commit();
        } catch (Throwable e) {
            connection.rollback();
            System.out.println("Rollbacked");
        } finally {
            connection.setAutoCommit(true);
        }
    }

    @Override
    public void register(User user) throws SQLException {
        try {
            connection.setAutoCommit(false);

            if (userRepository.usernameExists(user.getUsername())) {
                System.out.println("Username already exists, rolling back.");
                connection.rollback();
                return;
            }

            userRepository.create(user);
            connection.commit();
        } catch (Throwable e) {
            connection.rollback();
            System.out.println("Rollbacked");
        } finally {
            connection.setAutoCommit(true);
        }
    }


    @Override
    public void update(User user) throws SQLException {
        try {
            connection.setAutoCommit(false);
            userRepository.update(user);
            connection.commit();
        } catch (Throwable e) {
            connection.rollback();
            System.out.println("Rollbacked");
        } finally {
            connection.setAutoCommit(true);
        }
    }

    @Override
    public User getById(int userId) throws SQLException {
        connection.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
        return userRepository.getById(userId);
    }

    @Override
    public void deleteAll() throws SQLException {
        try {
            connection.setAutoCommit(false);
            userRepository.deleteAll();
            connection.commit();
        } catch (Throwable e) {
            connection.rollback();
            System.out.println("Rollbacked");
        } finally {
            connection.setAutoCommit(true);
        }
    }

    @Override
    public void deleteById(int userId) throws SQLException {
        try {
            connection.setAutoCommit(false);
            userRepository.deleteById(userId);
            connection.commit();
        } catch (Throwable e) {
            connection.rollback();
            System.out.println("Rollbacked");
        } finally {
            connection.setAutoCommit(true);
        }
    }

    @Override
    public List<User> getAll() throws SQLException {
        connection.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
        return userRepository.getAll();
    }


    }

