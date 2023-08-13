package com.CafeApp.CafeApp.Mutfak.İçecekler.EspressoKahve.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "espressokahveler")
public class modelEspressoKahveler {

    @Id
    private Long id;

    @Column(name = "kahve_adi")
    private String kahve_adi;
    
    @Column(name = "kahve_fiyati")
    private Integer kahve_fiyati;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getKahve_adi() {
        return this.kahve_adi;
    }

    public void setKahve_adi(String kahve_adi) {
        this.kahve_adi = kahve_adi;
    }

    public Integer getKahve_fiyati() {
        return this.kahve_fiyati;
    }

    public void setKahve_fiyati(Integer kahve_fiyati) {
        this.kahve_fiyati = kahve_fiyati;
    }
    
}
