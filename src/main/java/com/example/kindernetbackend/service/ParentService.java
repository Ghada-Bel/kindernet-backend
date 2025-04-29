package com.example.kindernetbackend.service;

import com.example.kindernetbackend.entity.Parent;
import java.util.List;

public interface ParentService {
    List<Parent> getAllParents();
    Parent getParentById(Long id);
    Parent createParent(Parent parent);
    Parent updateParent(Long id, Parent parent);
    void deleteParent(Long id);
    Parent findByEmail(String email); // Custom query usage
}
