package com.example.kindernetbackend.service.impl;

import com.example.kindernetbackend.entity.Child;
import com.example.kindernetbackend.repository.ChildRepository;
import com.example.kindernetbackend.service.ChildService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChildServiceImpl implements ChildService {

    @Autowired
    private ChildRepository childRepository;

    @Override
    public Child createChild(Child child) {
        return childRepository.save(child);
    }

    @Override
    public Child updateChild(Long id, Child updatedChild) {
        Child existing = childRepository.findById(id).orElseThrow(() -> new RuntimeException("Child not found"));
        existing.setFullName(updatedChild.getFullName());
        existing.setParent(updatedChild.getParent());
        existing.setKindergarten(updatedChild.getKindergarten());
        return childRepository.save(existing);
    }

    @Override
    public void deleteChild(Long id) {
        childRepository.deleteById(id);
    }

    @Override
    public Child getChildById(Long id) {
        return childRepository.findById(id).orElseThrow(() -> new RuntimeException("Child not found"));
    }

    @Override
    public List<Child> getAllChildren() {
        return childRepository.findAll();
    }

    @Override
    public List<Child> getChildrenByParentId(Long parentId) {
        return childRepository.findByParentId(parentId);
    }
}
