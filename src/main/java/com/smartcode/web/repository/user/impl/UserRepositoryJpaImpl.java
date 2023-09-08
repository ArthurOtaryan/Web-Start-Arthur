package com.smartcode.web.repository.user.impl;

import com.smartcode.web.model.User;
import com.smartcode.web.repository.user.UserRepository;
import com.smartcode.web.utils.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.NativeQuery;

import java.sql.SQLException;
import java.util.List;



public class UserRepositoryJpaImpl implements UserRepository {

    private final SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    @Override
    public User create(User user) {
        Session session = sessionFactory.getCurrentSession();
        session.save(user);
        session.close();
        return null;

    }

    @Override
    public void update(User user) {
        Session session = sessionFactory.getCurrentSession();
        session.update(user);
        session.close();

    }

    @Override
    public List<User> getAll() {
        return null;
    }

    @Override
    public boolean usernameExists(String username) {
        return false;
    }

    @Override
    public User getById(Integer id) {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public List<User> findByName(String string) {
        return null;
    }

    @Override
    public void deleteAll() throws SQLException {

    }

    @Override
    public void deleteById(int userId) throws SQLException {

    }

    @Override
    public User getByUsername(String username) {
        Session session = sessionFactory.openSession();
        NativeQuery<User> nativeQuery = session.createNativeQuery("SELECT * from users where username = :username", User.class);
        nativeQuery.setParameter("username", username);
        User singleResult = nativeQuery.getSingleResult();
        session.close();
        return singleResult;
    }

    @Override
    public boolean changePassword(User user, String oldPass, String newPass) {
        return false;
    }
}
