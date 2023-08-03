package com.springboot.redbook.Service;

import com.springboot.redbook.PayLoad.CommentDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CommentService {

   CommentDto CreatComment(long postId, CommentDto commentDto);
   List<CommentDto> getCommentsByPostId(long postId);
   CommentDto getCommentById(long postId, long commentId);
   CommentDto updateCommentById(long postId, long commentId,CommentDto commentDto);
   void deleteComment(long postId, long commentId);
}
