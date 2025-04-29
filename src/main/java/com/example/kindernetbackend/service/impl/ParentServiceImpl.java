package com.example.kindernetbackend.service.impl;

import com.example.kindernetbackend.entity.Parent;
import com.example.kindernetbackend.repository.ParentRepository;
import com.example.kindernetbackend.service.ParentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ParentServiceImpl implements ParentService {

    @Autowired
    private ParentRepository parentRepository;

    @Override
    public List<Parent> getAllParents() {
        return parentRepository.findAll();
    }

    @Override
    public Parent getParentById(Long id) {
        return parentRepository.findById(id).orElse(null);
    }

    @Override
    public Parent createParent(Parent parent) {
        return parentRepository.save(parent);
    }

    @Override
    public Parent updateParent(Long id, Parent updatedParent) {
        Optional<Parent> optionalParent = parentRepository.findById(id);
        if (optionalParent.isPresent()) {
            Parent existing = optionalParent.get();
            existing.setName(updatedParent.getName());
            existing.setEmail(updatedParent.getEmail());
            existing.setPassword(updatedParent.getPassword());
            return parentRepository.save(existing);
        }
        return null;
    }

    @Override
    public void deleteParent(Long id) {
        parentRepository.deleteById(id);
    }

    @Override
    public Parent findByEmail(String email) {
        return parentRepository.findByEmail(email);
    }
}
