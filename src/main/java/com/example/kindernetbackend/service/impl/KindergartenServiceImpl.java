package com.example.kindernetbackend.service.impl;

import com.example.kindernetbackend.entity.Kindergarten;
import com.example.kindernetbackend.repository.KindergartenRepository;
import com.example.kindernetbackend.service.KindergartenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class KindergartenServiceImpl implements KindergartenService {

    @Autowired
    private KindergartenRepository kindergartenRepository;

    @Override
    public List<Kindergarten> getAllKindergartens() {
        return kindergartenRepository.findAll();
    }

    @Override
    public Optional<Kindergarten> getKindergartenById(Long id) {
        return kindergartenRepository.findById(id);
    }

    @Override
    public Kindergarten saveKindergarten(Kindergarten kindergarten) {
        return kindergartenRepository.save(kindergarten);
    }

    @Override
    public void deleteKindergarten(Long id) {
        kindergartenRepository.deleteById(id);
    }
}

