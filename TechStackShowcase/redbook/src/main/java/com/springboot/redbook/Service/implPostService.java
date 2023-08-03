package com.springboot.redbook.Service;

import com.springboot.redbook.DAO.PostRepository;
import com.springboot.redbook.Entity.Post;
import com.springboot.redbook.Exception.ResourceNotFoundException;
import com.springboot.redbook.PayLoad.PostDto;
import com.springboot.redbook.PayLoad.PostResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class implPostService implements PostService {

    PostRepository postRepository;

    public implPostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public PostDto createPost(PostDto postDto) {
        Post post = mapToEntity(postDto);

        Post savedPost = postRepository.save(post);

        PostDto response = mapToDto(savedPost);
        return response;

    }

    @Override
    public List<PostDto> getAllPost() {
        List<Post> list = postRepository.findAll();
        List<PostDto> response =  list.stream().map(p->mapToDto(p)).collect(Collectors.toList());
        return response;

    }

    @Override
    public PostDto updatePostById(long id,PostDto postDto) {
        Post post =  postRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Post","id",id));
         post.setId(postDto.getId());
        post.setTitle(postDto.getTitle());
        post.setDescription(postDto.getDescription());
        post.setContent(postDto.getContent());

        Post updatePost = postRepository.save(post);
        return mapToDto(updatePost);
    }

    @Override
    public void deletePostById(long id) {
        Post post =  postRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Post","id",id));
        postRepository.delete(post);
    }

    @Override
    public PostResponse getAllPost(int pageNo, int pageSize, String sortBy, String sortDir) {
        Sort sort = sortDir.equalsIgnoreCase(Sort.Direction.ASC.name())? Sort.by(sortBy).ascending():
                Sort.by(sortBy).descending();
        PageRequest pageRequest = PageRequest.of(pageNo,pageSize,sort);
        Page<Post> pagePosts = postRepository.findAll(pageRequest);
        List<Post> content = pagePosts.getContent();
        List<PostDto> postDtos = content.stream().map(post -> mapToDto(post)).collect(Collectors.toList());

        PostResponse postResponse = new PostResponse();
        postResponse.setContent(postDtos);
        postResponse.setPageNo(pagePosts.getNumber());
        postResponse.setPageSize(pagePosts.getSize());
        postResponse.setTotalElements(pagePosts.getTotalElements());
        postResponse.setTotalPages(pagePosts.getTotalPages());
        postResponse.setLast(pagePosts.isLast());
        return postResponse;
    }

    @Override
    public PostDto getPostById(long id) {
       Post post =  postRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Post","id",id));

       return mapToDto(post);

    }

    private PostDto mapToDto(Post post){
        PostDto postDto = new PostDto();
        postDto.setId(post.getId());
        postDto.setTitle(post.getTitle());
        postDto.setDescription(post.getDescription());
        postDto.setContent(post.getContent());
        return postDto;

    }
    private Post mapToEntity(PostDto postDto){
        Post post = new Post();
        post.setId(postDto.getId());
        post.setTitle(postDto.getTitle());
        post.setDescription(postDto.getDescription());
        post.setContent(postDto.getContent());

        return post;

    }
}
