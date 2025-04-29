package com.example.kindernetbackend.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String content;

    @ManyToOne
    @JoinColumn(name = "sender_parent_id")
    private Parent senderParent;

    @ManyToOne
    @JoinColumn(name = "receiver_kindergarten_id")
    private Kindergarten receiverKindergarten;
}
