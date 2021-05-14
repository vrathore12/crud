package com.example.crud.resources;

import com.example.crud.models.Comment;
import com.example.crud.services.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/comments")
public class CommentResource {

    @Autowired
    private CommentService commentService;

    @PostMapping
    public Comment postComment(@RequestBody Comment comment){
        return commentService.postComment(comment);
    }

    @GetMapping
    public List<Comment> getAllComments(){
       return commentService.getAllComments();
    }

    @GetMapping("/find")
    public List<Comment> getCommentById(@RequestParam(name="id") String id){
        return commentService.getCommentById(id);
    }

    @PutMapping
    public void updateComment(@RequestBody Comment comment){
        commentService.updateComment(comment);
    }

    @DeleteMapping
    public void deleteComment(@RequestParam(name="id")String id){
        commentService.deleteComment(id);
    }

}
