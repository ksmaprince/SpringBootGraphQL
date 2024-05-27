package com.khun.SpringBootGraphQL.dto;

public class CreatePostDTO extends CommonResponse {
    String postName;
    String postContent;
    int noOfLikes;
    boolean postIsDisplay;

    public String getPostName() {
        return postName;
    }

    public void setPostName(String postName) {
        this.postName = postName;
    }

    public String getPostContent() {
        return postContent;
    }

    public void setPostContent(String postContent) {
        this.postContent = postContent;
    }

    public int getNoOfLikes() {
        return noOfLikes;
    }

    public void setNoOfLikes(int noOfLikes) {
        this.noOfLikes = noOfLikes;
    }

    public boolean isPostIsDisplay() {
        return postIsDisplay;
    }

    public void setPostIsDisplay(boolean postIsDisplay) {
        this.postIsDisplay = postIsDisplay;
    }
}
