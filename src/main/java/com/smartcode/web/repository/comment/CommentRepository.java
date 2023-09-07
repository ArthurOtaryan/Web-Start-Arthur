package com.smartcode.web.repository.comment;

import com.smartcode.web.model.Comment;

import java.util.List;

public interface CommentRepository  {
    Comment create(Comment comment);
    void update(Integer id,Comment comment);

    List<Comment> getAll(Integer userId);

    Comment getById(Integer commentId);
    boolean delete(Comment comment);

    void edit(Comment comment);


}
