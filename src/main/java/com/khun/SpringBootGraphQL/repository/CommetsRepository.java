package com.khun.SpringBootGraphQL.repository;

import com.khun.SpringBootGraphQL.model.PostComments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommetsRepository extends JpaRepository<PostComments, Long> {
}
