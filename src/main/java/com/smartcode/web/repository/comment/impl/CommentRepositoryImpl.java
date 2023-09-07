package com.smartcode.web.repository.comment.impl;

import com.smartcode.web.model.Comment;
import com.smartcode.web.repository.comment.CommentRepository;
import com.smartcode.web.utils.DataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CommentRepositoryImpl implements CommentRepository {
    private final Connection connection = DataSource.getInstance().getConnection();

    public CommentRepositoryImpl(){
        try {
            connection.createStatement().execute(
                    """
                            CREATE TABLE IF NOT EXISTS comments (
                                id serial primary key ,
                                title varchar(255) not null ,
                                description varchar(255) not null ,
                                users_id Integer not null
                                references users
                            );
                            """);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    @Override
    public Comment create(Comment comment) {
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement("""
                                            INSERT INTO comments (title, description, users_id)
                                                               VALUES (?, ?, ?)
                                                      """);

            preparedStatement.setString(1, comment.getTitle());
            preparedStatement.setString(2,comment.getDescription());
            preparedStatement.setInt(3,comment.getUser_id());
            preparedStatement.execute();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                preparedStatement.close();
                connection.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
        return comment;

    }

    public void update(Integer id, Comment comment) {
        try {
            PreparedStatement statement = connection.prepareStatement(
                    "UPDATE comments SET title=?, description=? WHERE id=?"
            );
            statement.setString(1, comment.getTitle());
            statement.setString(2, comment.getDescription());
            statement.setInt(3, id);
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Comment> getAll(Integer userId) {
        List<Comment> comments = new ArrayList<>();
        try {
            PreparedStatement statement = connection.prepareStatement(
                    "SELECT * FROM comments WHERE users_id=?"
            );
            statement.setInt(1, userId);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Comment comment = new Comment(
                        resultSet.getString("title"),
                        resultSet.getString("description"),
                        resultSet.getInt("users_id")
                );

                comments.add(comment);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return comments;
    }

    public Comment getById(Integer commentId) {
        try {
            PreparedStatement statement = connection.prepareStatement(
                    "SELECT * FROM comments WHERE id=?"
            );
            statement.setInt(1, commentId);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                return new Comment(
                        resultSet.getString("title"),
                        resultSet.getString("description"),
                        resultSet.getInt("users_id")
                );
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }


    public boolean delete(Comment comment) {
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement(
                    "DELETE FROM comments WHERE title = ? and users_id = ?"
            );
            preparedStatement.setString(1, comment.getTitle());
            preparedStatement.setInt(2, comment.getUser_id());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return false;
    }

    @Override
    public void edit(Comment comment) {
        delete(comment);
        create(comment);
    }
}
