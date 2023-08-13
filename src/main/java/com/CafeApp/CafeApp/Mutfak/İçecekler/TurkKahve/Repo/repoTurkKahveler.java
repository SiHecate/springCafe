package com.CafeApp.CafeApp.Mutfak.İçecekler.TurkKahve.Repo;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.CafeApp.CafeApp.Mutfak.İçecekler.TurkKahve.Model.modelTurkKahveler;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;

@Repository
public class repoTurkKahveler 
{

    @PersistenceContext
    private EntityManager entityManager;

    public List<modelTurkKahveler> getAllTurkKahveler() {
        TypedQuery<modelTurkKahveler> query = entityManager.createQuery("SELECT e FROM modelTurkKahveler e", modelTurkKahveler.class);
        return query.getResultList();
    }

    public Optional<modelTurkKahveler> findById(Long id) {
        return Optional.ofNullable(entityManager.find(modelTurkKahveler.class, id));
    }
    

}
