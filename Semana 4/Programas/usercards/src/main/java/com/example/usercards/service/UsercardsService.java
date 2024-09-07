package com.example.usercards.service;

import com.example.usercards.entity.Userscards;
import java.util.List;

public interface UsercardsService {
    List<Userscards> findAll();
    Userscards findById(int id);
    List<Userscards> findByNormalCards(int normalCards);
    List<Userscards> findByRareCards(int rareCards);
    List<Userscards> findBySuperRareCards(int superRareCards);
    Userscards save(Userscards usercards);
    void deleteById(int id);
}
