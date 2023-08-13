package com.CafeApp.CafeApp.Mutfak.İçecekler.SogukEspressoKahve.Repo;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.CafeApp.CafeApp.Mutfak.İçecekler.SogukEspressoKahve.Model.modelSogukEspressoKahveler;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;

@Repository
public class repoSogukEspressoKahveler {

    @PersistenceContext
    private EntityManager entityManager;

    public List<modelSogukEspressoKahveler> getAllSogukEspressoKahveler() {
        TypedQuery<modelSogukEspressoKahveler> query = entityManager.createQuery("SELECT e FROM modelSogukEspressoKahveler e", modelSogukEspressoKahveler.class);
        return query.getResultList();
    }

    public Optional<modelSogukEspressoKahveler> findById(Long id) {
        return Optional.ofNullable(entityManager.find(modelSogukEspressoKahveler.class, id));
    }
    
}
