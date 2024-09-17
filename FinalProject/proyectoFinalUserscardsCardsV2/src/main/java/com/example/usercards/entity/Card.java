package com.example.usercards.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "cards")
@Data // Automatically generate getters and setters
@NoArgsConstructor // Generate constructors without arguments
@AllArgsConstructor // Generate constructor with all arguments
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "type")
    private String type;
    
    @Column(name = "price")
    private double price;

    @Column(name = "description")
    private String description;
}
