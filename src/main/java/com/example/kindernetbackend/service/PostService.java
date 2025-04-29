package com.example.kindernetbackend.service;

import com.example.kindernetbackend.entity.Post;
import java.util.List;

public interface PostService {
    List<Post> getAllPosts();
    Post savePost(Post post);
    void deletePost(Long id);
}

