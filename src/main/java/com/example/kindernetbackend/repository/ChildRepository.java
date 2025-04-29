package com.example.kindernetbackend.repository;

import com.example.kindernetbackend.entity.Child;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ChildRepository extends JpaRepository<Child, Long> {

    List<Child> findByParentId(Long parentId);

    List<Child> findByKindergartenId(Long kindergartenId);
}
