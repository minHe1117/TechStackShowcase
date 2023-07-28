package com.springboot.redbook.Service;

import com.springboot.redbook.DAO.PostRepository;
import com.springboot.redbook.Entity.Post;
import com.springboot.redbook.PayLoad.PostDto;
import org.springframework.stereotype.Service;

@Service
public class implPostService implements PostService {
    PostRepository postRepository;

    public implPostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public PostDto createPost(PostDto postDto) {
        Post post = new Post();
        post.setId(postDto.getId());
        post.setTitle(postDto.getTitle());
        post.setDescription(postDto.getDescription());
        post.setContent(postDto.getContent());

        Post savedPost = postRepository.save(post);

       PostDto response = new PostDto();
        response.setId(savedPost.getId());
        response.setTitle(savedPost.getTitle());
        response.setDescription(savedPost.getDescription());
        response.setContent(savedPost.getContent());

        return response;

    }
}
