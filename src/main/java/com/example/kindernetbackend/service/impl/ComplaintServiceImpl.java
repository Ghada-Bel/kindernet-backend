package com.example.kindernetbackend.service.impl;

import com.example.kindernetbackend.entity.Complaint;
import com.example.kindernetbackend.repository.ComplaintRepository;
import com.example.kindernetbackend.service.ComplaintService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComplaintServiceImpl implements ComplaintService {

    @Autowired
    private ComplaintRepository complaintRepository;

    @Override
    public List<Complaint> getAllComplaints() {
        return complaintRepository.findAll();
    }

    @Override
    public Complaint saveComplaint(Complaint complaint) {
        return complaintRepository.save(complaint);
    }

    @Override
    public void deleteComplaint(Long id) {
        complaintRepository.deleteById(id);
    }
}
