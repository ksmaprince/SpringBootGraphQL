package com.khun.SpringBootGraphQL.dto;

import java.io.Serializable;

public class PostCommentsDTO implements Serializable {
    Long id;
    String commentContent;

    public PostCommentsDTO(Long id, String commentContent) {
        this.id = id;
        this.commentContent = commentContent;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }
}
