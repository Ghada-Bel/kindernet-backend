package com.example.kindernetbackend.service;

import com.example.kindernetbackend.entity.Kindergarten;
import java.util.List;
import java.util.Optional;

public interface KindergartenService {
    List<Kindergarten> getAllKindergartens();
    Optional<Kindergarten> getKindergartenById(Long id);
    Kindergarten saveKindergarten(Kindergarten kindergarten);
    void deleteKindergarten(Long id);
}

