package com.example.kindernetbackend.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;

    @ManyToOne
    @JoinColumn(name = "kindergarten_id")
    private Kindergarten kindergarten;
}
