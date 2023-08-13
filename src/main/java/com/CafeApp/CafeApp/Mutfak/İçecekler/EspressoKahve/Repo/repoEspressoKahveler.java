package com.CafeApp.CafeApp.Mutfak.İçecekler.EspressoKahve.Repo;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.CafeApp.CafeApp.Mutfak.İçecekler.EspressoKahve.Model.modelEspressoKahveler;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;

@Repository
public class repoEspressoKahveler {

    @PersistenceContext
    private EntityManager entityManager;

    public List<modelEspressoKahveler> getAllEspressoKahveler() {
        TypedQuery<modelEspressoKahveler> query = entityManager.createQuery("SELECT e FROM modelEspressoKahveler e", modelEspressoKahveler.class);
        return query.getResultList();
    }

    public Optional<modelEspressoKahveler> findById(Long id) {
        return Optional.ofNullable(entityManager.find(modelEspressoKahveler.class, id));
    }
    
}
