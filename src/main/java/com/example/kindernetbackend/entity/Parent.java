package com.example.kindernetbackend.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Parent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String password;

    @OneToMany(mappedBy = "parent", cascade = CascadeType.ALL)
    private List<Child> children;

    @OneToMany(mappedBy = "parent", cascade = CascadeType.ALL)
    private List<Complaint> complaints;

    @OneToMany(mappedBy = "senderParent", cascade = CascadeType.ALL)
    private List<Message> messagesSent;

    @ManyToMany
    @JoinTable(
            name = "subscription",
            joinColumns = @JoinColumn(name = "parent_id"),
            inverseJoinColumns = @JoinColumn(name = "kindergarten_id")
    )
    private List<Kindergarten> subscribedKindergartens;
}
