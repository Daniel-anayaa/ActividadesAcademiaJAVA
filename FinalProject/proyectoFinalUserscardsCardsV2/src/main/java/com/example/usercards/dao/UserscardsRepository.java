package com.example.usercards.dao;

import com.example.usercards.entity.Userscards;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserscardsRepository extends JpaRepository<Userscards, Integer> {
    
    // Custom query methods using method naming conventions
    List<Userscards> findByNormalcards(int normalCards);
    List<Userscards> findByRarecards(int rareCards);
    List<Userscards> findBySuperrarecards(int superRareCards);
}
