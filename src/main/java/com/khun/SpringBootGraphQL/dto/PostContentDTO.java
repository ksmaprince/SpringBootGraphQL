package com.khun.SpringBootGraphQL.dto;

import java.util.List;

public class PostContentDTO extends CommonResponse{
    List<PostDTO> postList;

    public List<PostDTO> getPostList() {
        return postList;
    }

    public void setPostList(List<PostDTO> postList) {
        this.postList = postList;
    }

    @Override
    public String toString() {
        return "PostContentDTO [postList=" + postList + "]";
    }
}