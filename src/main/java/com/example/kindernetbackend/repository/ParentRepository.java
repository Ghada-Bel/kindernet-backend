package com.example.kindernetbackend.repository;

import com.example.kindernetbackend.entity.Parent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ParentRepository extends JpaRepository<Parent, Long> {
    // Find Parent by Email
    Parent findByEmail(String email);

    // Find Parent by Parent ID
    Parent findById(long id);  // This actually already exists in JpaRepository by default!

    // Find Parents by Name (returns a list, in case multiple parents have the same name)
    List<Parent> findByName(String name);

    @Query("SELECT p FROM Parent p JOIN p.children c WHERE c.id = :childId")
    Parent findParentByChildId(@Param("childId") Long childId);
}
