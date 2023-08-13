package com.CafeApp.CafeApp.Mutfak.Ekstralar.Repo;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.CafeApp.CafeApp.Mutfak.Ekstralar.Model.modelEkstralar;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;

@Repository
public class repoEkstralar {

    @PersistenceContext
    private EntityManager entityManager;

    public List<modelEkstralar> getAllEkstralar() {
        TypedQuery<modelEkstralar> query = entityManager.createQuery("SELECT e FROM modelEkstralar e", modelEkstralar.class);
        return query.getResultList();
    }

    public Optional<modelEkstralar> findById(Long id) {
        return Optional.ofNullable(entityManager.find(modelEkstralar.class, id));
    }
    
}
