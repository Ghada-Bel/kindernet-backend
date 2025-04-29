package com.example.kindernetbackend.service;

import com.example.kindernetbackend.entity.Notification;
import java.util.List;

public interface NotificationService {
    List<Notification> getAllNotifications();
    Notification saveNotification(Notification notification);
    void deleteNotification(Long id);
}

