package com.khun.SpringBootGraphQL.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class PostComments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String comentContent;

    public PostComments() {
        super();
        // TODO Auto-generated constructor stub
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getComentContent() {
        return comentContent;
    }
    public void setComentContent(String comentContent) {
        this.comentContent = comentContent;
    }
    @Override
    public String toString() {
        return "PostComments [id=" + id + ", comentContent=" + comentContent + "]";
    }
}
