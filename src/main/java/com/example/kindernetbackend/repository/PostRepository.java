package com.example.kindernetbackend.repository;

import com.example.kindernetbackend.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {

    List<Post> findByParentId(Long parentId);

    List<Post> findByKindergartenId(Long kindergartenId);
}
