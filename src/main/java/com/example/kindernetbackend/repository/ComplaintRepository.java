package com.example.kindernetbackend.repository;

import com.example.kindernetbackend.entity.Complaint;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ComplaintRepository extends JpaRepository<Complaint, Long> {
    List<Complaint> findByParentId(Long parentId);

    List<Complaint> findByKindergartenId(Long kindergartenId);
}
