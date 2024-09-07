package com.example.usercards.service;

import com.example.usercards.entity.Userscards;
import java.util.List;

public interface UsercardsService {
    List<Userscards> findAll(); // Retrieves all userscards
    Userscards findById(int id); // Finds a userscard by ID
    List<Userscards> findByNormalCards(int normalCards); // Finds userscards by normal card count
    List<Userscards> findByRareCards(int rareCards); // Finds userscards by rare card count
    List<Userscards> findBySuperRareCards(int superRareCards); // Finds userscards by super rare card count
    Userscards save(Userscards usercards); // Saves or updates a userscard
    void deleteById(int id); // Deletes a userscard by ID
}
