package com.example.usercards.service;

import com.example.usercards.dao.UserscardsDAO;
import com.example.usercards.entity.Userscards;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import jakarta.transaction.Transactional;
import java.util.List;

@Service
public class UsercardsServiceImpl implements UsercardsService {

    private final UserscardsDAO userscardsDAO;

    @Autowired
    public UsercardsServiceImpl(UserscardsDAO userscardsDAO) {
        this.userscardsDAO = userscardsDAO;
    }

    @Override
    public List<Userscards> findAll() {
        return userscardsDAO.findAll();
    }

    @Override
    public Userscards findById(int id) {
        return userscardsDAO.findById(id);
    }

    @Override
    public List<Userscards> findByNormalCards(int normalCards) {
        return userscardsDAO.findByNormalCards(normalCards);
    }

    @Override
    public List<Userscards> findByRareCards(int rareCards) {
        return userscardsDAO.findByRareCards(rareCards);
    }

    @Override
    public List<Userscards> findBySuperRareCards(int superRareCards) {
        return userscardsDAO.findBySuperRareCards(superRareCards);
    }

    @Override
    @Transactional
    public Userscards save(Userscards usercards) {
        return userscardsDAO.save(usercards);
    }

    @Override
    @Transactional
    public void deleteById(int id) {
        userscardsDAO.deleteById(id);
    }
}
