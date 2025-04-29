package com.example.kindernetbackend.service;

import com.example.kindernetbackend.entity.Complaint;
import java.util.List;

public interface ComplaintService {
    List<Complaint> getAllComplaints();
    Complaint saveComplaint(Complaint complaint);
    void deleteComplaint(Long id);
}

