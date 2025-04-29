package com.example.kindernetbackend.service;

import com.example.kindernetbackend.entity.Child;
import java.util.List;

public interface ChildService {
    Child createChild(Child child);
    Child updateChild(Long id, Child updatedChild);
    void deleteChild(Long id);
    Child getChildById(Long id);
    List<Child> getAllChildren();
    List<Child> getChildrenByParentId(Long parentId);
}
