package com.khun.SpringBootGraphQL.controller;

import com.khun.SpringBootGraphQL.dto.CreatePostDTO;
import com.khun.SpringBootGraphQL.dto.PostContentDTO;
import com.khun.SpringBootGraphQL.model.Posts;
import com.khun.SpringBootGraphQL.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class PostController {

    @Autowired
    private PostService postService;

    @QueryMapping
    public PostContentDTO getPosts(Long postId) {
        return postService.getPosts(postId);
    }

    @QueryMapping
    public PostContentDTO allPost() {
        return postService.allPosts();
    }

    @MutationMapping
    public Posts createPosts(CreatePostDTO createPostDTO) {
        return postService.createPost(createPostDTO);
    }

    @MutationMapping
    public String deletePost(Long postId) {
        postService.deletePost(postId);
        return "Deleted post Id: " + postId;
    }
}
