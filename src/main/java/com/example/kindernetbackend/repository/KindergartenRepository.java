package com.example.kindernetbackend.repository;

import com.example.kindernetbackend.entity.Kindergarten;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface KindergartenRepository extends JpaRepository<Kindergarten, Long> {
    Optional<Kindergarten> findByEmail(String email);

    @Query("SELECT k FROM Kindergarten k JOIN k.children c WHERE c.id = :childId")
    Kindergarten findKindergartenByChildId(@Param("childId") Long childId);

}
