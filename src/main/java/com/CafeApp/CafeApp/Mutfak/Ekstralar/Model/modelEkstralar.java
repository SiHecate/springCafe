package com.CafeApp.CafeApp.Mutfak.Ekstralar.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ekstralar")
public class modelEkstralar {

    @Id
    private Long id;

    @Column(name = "ekstra_adi")
    private String ekstraAdi;

    @Column(name = "ekstra_fiyati")
    private Integer ekstraFiyati;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEkstraAdi() {
        return this.ekstraAdi;
    }

    public void setEkstraAdi(String ekstraAdi) {
        this.ekstraAdi = ekstraAdi;
    }

    public Integer getEkstraFiyati() {
        return this.ekstraFiyati;
    }

    public void setEkstraFiyati(Integer ekstraFiyati) {
        this.ekstraFiyati = ekstraFiyati;
    }

}


