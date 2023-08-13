package com.CafeApp.CafeApp.Mutfak.İçecekler.FiltreKahve.Repo;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.CafeApp.CafeApp.Mutfak.İçecekler.FiltreKahve.Model.modelFiltreKahveler;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;

@Repository
public class repoFiltreKahveler {
    

    @PersistenceContext
    private EntityManager entityManager;

    public List<modelFiltreKahveler> getAllFiltreKahveler() {
        TypedQuery<modelFiltreKahveler> query = entityManager.createQuery("SELECT e FROM modelFiltreKahveler e", modelFiltreKahveler.class);
        return query.getResultList();
    }


    public Optional<modelFiltreKahveler> findById(Long id) {
        return Optional.ofNullable(entityManager.find(modelFiltreKahveler.class, id));
    }

}
