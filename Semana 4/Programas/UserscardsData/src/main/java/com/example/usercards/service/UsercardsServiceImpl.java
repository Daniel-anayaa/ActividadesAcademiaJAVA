package com.example.usercards.service;

import com.example.usercards.dao.UserscardsRepository;
import com.example.usercards.entity.Userscards;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsercardsServiceImpl implements UsercardsService {

    private final UserscardsRepository userscardsRepository;

    // Injects the repository using constructor injection
    @Autowired
    public UsercardsServiceImpl(UserscardsRepository userscardsRepository) {
        this.userscardsRepository = userscardsRepository;
    }

    @Override
    public List<Userscards> findAll() {
        return userscardsRepository.findAll(); // Calls the repository method to get all userscards
    }

    @Override
    public Userscards findById(int id) {
        Optional<Userscards> result = userscardsRepository.findById(id); // Calls the repository method to find by ID
        return result.orElse(null); // Returns the result or null if not found
    }

    @Override
    public List<Userscards> findByNormalCards(int normalCards) {
        return userscardsRepository.findByNormalcards(normalCards); // Calls the custom repository method
    }

    @Override
    public List<Userscards> findByRareCards(int rareCards) {
        return userscardsRepository.findByRarecards(rareCards); // Calls the custom repository method
    }

    @Override
    public List<Userscards> findBySuperRareCards(int superRareCards) {
        return userscardsRepository.findBySuperrarecards(superRareCards); // Calls the custom repository method
    }

    @Override
    public Userscards save(Userscards usercards) {
        return userscardsRepository.save(usercards); // Calls the repository method to save or update the userscard
    }

    @Override
    public void deleteById(int id) {
        userscardsRepository.deleteById(id); // Calls the repository method to delete by ID
    }
}
