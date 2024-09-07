package com.example.usercards.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;
import com.example.usercards.entity.Userscards;
import java.util.List;

@Repository
public class UserscardsDAOJpaImpl implements UserscardsDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Userscards> findAll() {
        // Use JPQL to obtain all data from usercards
        TypedQuery<Userscards> query = entityManager.createQuery("from Userscards", Userscards.class);
        return query.getResultList();
    }

    @Override
    public Userscards findById(int id) {
        // Use EntityManager to search for id
        return entityManager.find(Userscards.class, id);
    }

    @Override
    public List<Userscards> findByNormalCards(int normalCards) {
        // Use JPQL to look up with the specified number of normal cards
        TypedQuery<Userscards> query = entityManager.createQuery(
            "from Userscards where normalcards = :normalCards", Userscards.class);
        query.setParameter("normalCards", normalCards);
        return query.getResultList();
    }

    @Override
    public List<Userscards> findByRareCards(int rareCards) {
        // Use JPQL to look up with the specified number of rare cards
        TypedQuery<Userscards> query = entityManager.createQuery(
            "from Userscards where rarecards = :rareCards", Userscards.class);
        query.setParameter("rareCards", rareCards);
        return query.getResultList();
    }

    @Override
    public List<Userscards> findBySuperRareCards(int superRareCards) {
        // Use JPQL to look up with the specified number of super rare cards
        TypedQuery<Userscards> query = entityManager.createQuery(
            "from Userscards where superrarecards = :superRareCards", Userscards.class);
        query.setParameter("superRareCards", superRareCards);
        return query.getResultList();
    }

    @Override
    @Transactional
    public Userscards save(Userscards usercards) {
        // Use EntityManager to save or update usercards (users)
        return entityManager.merge(usercards);
    }

    @Override
    @Transactional
    public void deleteById(int id) {
        // Search the user by id and eliminate it
        Userscards usercards = entityManager.find(Userscards.class, id);
        if (usercards != null) {
            entityManager.remove(usercards);
        }
    }
}
