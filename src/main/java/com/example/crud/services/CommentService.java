package com.example.crud.services;

import com.example.crud.models.Comment;
import com.example.crud.repositories.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {

    @Autowired
    CommentRepository commentRepository;

    public Comment postComment(Comment comment) {
        return commentRepository.save(comment);
    }

    public List<Comment> getAllComments() {
        return commentRepository.findAll();
    }


    public List<Comment> getCommentById(String id) {
        return commentRepository.findAllById(id);
    }

    public void updateComment(Comment comment) {
        commentRepository.save(comment);
    }

    public void deleteComment(String id) {
        commentRepository.deleteById(id);
    }
}
