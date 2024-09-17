package com.example.usercards.service;

import com.example.usercards.entity.Userscards;
import java.util.List;
import java.util.Optional;

public interface UsercardsService {
    List<Userscards> findAll(); // Retrieves all userscards
    Optional<Userscards> findById(int id); // Finds a userscard by ID and returns an Optional
    List<Userscards> findByNormalCards(int normalCards); // Finds userscards by normal card count
    List<Userscards> findByRareCards(int rareCards); // Finds userscards by rare card count
    List<Userscards> findBySuperRareCards(int superRareCards); // Finds userscards by super rare card count
    Userscards save(Userscards usercards); // Saves or updates a userscard
    void deleteById(int id); // Deletes a userscard by ID
    
}
