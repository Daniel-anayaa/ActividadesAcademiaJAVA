package com.example.usercards.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
//We define the entity of sql
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="user_card")

public class Userscards {
	//Define the fields
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="age")
	private int age;
	
	@Column(name="normal_cards")
	private int normalcards;
	
	@Column(name="rare_cards")
	private int rarecards;
	
	@Column(name="superrare_cards")
	private int superrarecards;	
	
	
}
