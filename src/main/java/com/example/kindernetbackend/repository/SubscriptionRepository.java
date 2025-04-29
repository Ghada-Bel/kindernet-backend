package com.example.kindernetbackend.repository;

import com.example.kindernetbackend.entity.Subscription;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SubscriptionRepository extends JpaRepository<Subscription, Long> {
    List<Subscription> findByParentId(Long parentId);

    List<Subscription> findByKindergartenId(Long kindergartenId);
}
