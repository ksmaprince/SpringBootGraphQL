package com.khun.SpringBootGraphQL.dto;

import java.io.Serializable;
import java.util.List;

public class PostDTO implements Serializable {
    private Long id;

    private String name;

    private String content;

    private int noOfLikes;

    private boolean isDisplay;

    public PostDTO(Long id, String name, String content, int noOfLikes, boolean isDisplay, List<PostCommentsDTO> comments) {
        this.id = id;
        this.name = name;
        this.content = content;
        this.noOfLikes = noOfLikes;
        this.isDisplay = isDisplay;
        this.comments = comments;
    }

    private List<PostCommentsDTO> comments;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getNoOfLikes() {
        return noOfLikes;
    }

    public void setNoOfLikes(int noOfLikes) {
        this.noOfLikes = noOfLikes;
    }

    public boolean isDisplay() {
        return isDisplay;
    }

    public void setDisplay(boolean display) {
        isDisplay = display;
    }

    public List<PostCommentsDTO> getComments() {
        return comments;
    }

    public void setComments(List<PostCommentsDTO> comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "PostDTO[" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", content='" + content + '\'' +
                ", noOfLikes=" + noOfLikes +
                ", isDisplay=" + isDisplay +
                ", comments=" + comments +
                ']';
    }
}
