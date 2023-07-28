package com.springboot.redbook.Controller;

import com.springboot.redbook.PayLoad.PostDto;
import com.springboot.redbook.Service.PostService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v2/posts")
public class PostController {
    PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }
    @PostMapping
    public ResponseEntity<PostDto> createPost(@RequestBody PostDto postDto){
        return new ResponseEntity(postService.createPost(postDto), HttpStatus.CREATED);
    }
}
