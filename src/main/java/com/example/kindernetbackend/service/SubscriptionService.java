package com.example.kindernetbackend.service;

import com.example.kindernetbackend.entity.Subscription;
import java.util.List;

public interface SubscriptionService {
    List<Subscription> getAllSubscriptions();
    Subscription saveSubscription(Subscription subscription);
    void deleteSubscription(Long id);
}
