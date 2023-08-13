package com.CafeApp.CafeApp.SiparisEkrani.repo;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.CafeApp.CafeApp.SiparisEkrani.Model.modelSiparisDetaylari;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
public class repoSiparisDetaylari {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void siparisDetaylariniKaydet(modelSiparisDetaylari siparisDetaylari) {
        entityManager.persist(siparisDetaylari);
    }

    public List<modelSiparisDetaylari> getAllSiparisDetaylari() {
        TypedQuery<modelSiparisDetaylari> query = entityManager.createQuery("SELECT s FROM modelSiparisDetaylari s", modelSiparisDetaylari.class);
        return query.getResultList();
    }
    

}
