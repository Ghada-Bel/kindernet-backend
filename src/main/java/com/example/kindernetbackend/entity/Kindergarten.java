package com.example.kindernetbackend.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Entity
@Data
public class Kindergarten {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String address;

    @OneToMany(mappedBy = "kindergarten")
    private List<Child> children;

    @OneToMany(mappedBy = "kindergarten")
    private List<Event> events;

    @OneToMany(mappedBy = "kindergarten")
    private List<Post> posts;

    @OneToMany(mappedBy = "receiverKindergarten")
    private List<Message> receivedMessages;

    @OneToMany(mappedBy = "kindergarten")
    private List<Complaint> complaints;
}
