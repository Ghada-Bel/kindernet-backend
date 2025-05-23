package com.example.kindernetbackend.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Notification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String content;

    @ManyToOne
    @JoinColumn(name = "event_id")
    private Event event;
}
