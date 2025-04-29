package com.example.kindernetbackend.repository;

import com.example.kindernetbackend.entity.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MessageRepository extends JpaRepository<Message, Long> {
    List<Message> findBySenderParentId(Long parentId);

    List<Message> findByReceiverKindergartenId(Long kindergartenId);

    List<Message> findBySenderParentName(String parentName);

    List<Message> findByReceiverKindergartenName(String kindergartenName);}
