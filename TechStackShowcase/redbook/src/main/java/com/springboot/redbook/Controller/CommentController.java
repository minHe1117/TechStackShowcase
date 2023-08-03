package com.springboot.redbook.Controller;

import com.springboot.redbook.PayLoad.CommentDto;
import com.springboot.redbook.Service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class CommentController {
    @Autowired
    CommentService commentService;

    @PostMapping("/posts/{id}/comments")
    public ResponseEntity<CommentDto> creatComment(@PathVariable(value = "postId") long postId, @RequestBody CommentDto commentDto){
        return new ResponseEntity<>(commentService.CreatComment(postId,commentDto), HttpStatus.CREATED);
    }
    @GetMapping("/posts/{postId}/comments")
    public List<CommentDto> getCommentsByPostId(@PathVariable(value = "postId") long postId) {
        return commentService.getCommentsByPostId(postId);
    }

    @GetMapping("/posts/{postId}/comments/{commentId}")
    public ResponseEntity<CommentDto> getCommentById(@PathVariable(name = "postId") long postId,
                                                    @PathVariable(name = "commentId") long commentId){

        return ResponseEntity.ok(commentService.getCommentById(postId, commentId));

    }
    @PutMapping("/posts/{postid}/comments/{id}")
    public ResponseEntity<CommentDto> updateCommentById(@PathVariable(name = "postId") long postId,
                                                        @PathVariable(name = "commentId") long commentId,
                                                        @RequestBody CommentDto commentDto){
        CommentDto updateComment = commentService.updateCommentById(postId, commentId, commentDto);
        return new ResponseEntity<>(updateComment, HttpStatus.OK);

    }
    @DeleteMapping("/posts/{postId}/comments/{id}")
    public ResponseEntity<String> deleteComment(@PathVariable(value = "postId") Long postId,
                                                @PathVariable(value = "id") Long commentId) {
        commentService.deleteComment(postId, commentId);

        return new ResponseEntity<>("Comment deleted Successfully", HttpStatus.OK);
    }
}
