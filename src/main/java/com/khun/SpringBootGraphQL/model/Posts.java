package com.khun.SpringBootGraphQL.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Posts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String content;
    private int noOfLikes;
    private boolean isDisplay;

    @OneToMany(cascade = CascadeType.ALL,orphanRemoval = true,fetch = FetchType.EAGER)
    @JoinColumn(name = "post_id")
    private List<PostComments> comments = new ArrayList<>();

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
    public void setDisplay(boolean isDisplay) {
        this.isDisplay = isDisplay;
    }
    public List<PostComments> getComments() {
        return comments;
    }
    public void setComments(List<PostComments> comments) {
        this.comments = comments;
    }
    public Posts() {
        super();
        // TODO Auto-generated constructor stub
    }
    @Override
    public String toString() {
        return "Posts [id=" + id + ", name=" + name + ", content=" + content + ", noOfLikes=" + noOfLikes
                + ", isDisplay=" + isDisplay + ", comments=" + comments + "]";
    }
}
