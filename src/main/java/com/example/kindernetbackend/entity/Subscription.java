package com.example.kindernetbackend.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Subscription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "parent_id")
    private Parent parent;

    @ManyToOne
    @JoinColumn(name = "kindergarten_id")
    private Kindergarten kindergarten;
}
