package com.springboot.redbook.DAO;

import com.springboot.redbook.Entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment,Long> {
   //naming convention
    List<Comment> findByPostId(long postId);
}
