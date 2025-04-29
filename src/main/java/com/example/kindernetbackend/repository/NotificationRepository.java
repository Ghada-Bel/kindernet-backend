package com.example.kindernetbackend.repository;

import com.example.kindernetbackend.entity.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NotificationRepository extends JpaRepository<Notification, Long> {
    List<Notification> findByParentId(Long parentId);

    List<Notification> findByKindergartenId(Long kindergartenId);
}
