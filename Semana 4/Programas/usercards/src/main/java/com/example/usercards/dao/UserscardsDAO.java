package com.example.usercards.dao;

import java.util.List;  
import com.example.usercards.entity.Userscards;

public interface UserscardsDAO {

    List<Userscards> findAll(); // List of usercards to find
    Userscards findById(int id);
    List<Userscards> findByNormalCards(int normalCards); // Returns a list if exists
    List<Userscards> findByRareCards(int rareCards); // Returns a list
    List<Userscards> findBySuperRareCards(int superRareCards); // Returns a list
    Userscards save(Userscards usercards); // Save or update the user
    void deleteById(int id); // Delete by id 
    
}
