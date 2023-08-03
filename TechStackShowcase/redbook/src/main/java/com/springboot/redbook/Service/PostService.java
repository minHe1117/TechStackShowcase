package com.springboot.redbook.Service;


import com.springboot.redbook.PayLoad.PostDto;
import com.springboot.redbook.PayLoad.PostResponse;

import java.util.List;

public interface PostService {
    PostDto createPost(PostDto postDto);

    List<PostDto> getAllPost();

    PostDto getPostById(long id);

    PostDto updatePostById(long id, PostDto postDto);

    void deletePostById(long id);

    PostResponse getAllPost(int pageNo, int pageSize,String sortBy, String sortDir);


}
