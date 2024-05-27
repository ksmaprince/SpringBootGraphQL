package com.khun.SpringBootGraphQL.repository;

import com.khun.SpringBootGraphQL.model.Posts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Posts, Long> {
}
