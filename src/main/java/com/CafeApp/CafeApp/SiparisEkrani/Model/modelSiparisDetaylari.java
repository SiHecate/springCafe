package com.CafeApp.CafeApp.SiparisEkrani.Model;


import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "siparis_detaylari")
public class modelSiparisDetaylari {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

    @Column(name = "urun_adi")
	private String urunAdi;

	public String getUrunAdi() {
		return this.urunAdi;
	}

	public void setUrunAdi(String urunAdi) {
		this.urunAdi = urunAdi;
	}

    @Column(name = "urun_fiyati")
	private Integer urunFiyati;

	public Integer getUrunFiyati() {
		return this.urunFiyati;
	}

	public void setUrunFiyati(Integer urunFiyati) {
		this.urunFiyati = urunFiyati;
	}

	@Column(name = "gonderilme_zamani")
	private LocalDateTime gonderilmeZamani;

	public LocalDateTime getGonderilmeZamani() {
		return this.gonderilmeZamani;
	}

	public void setGonderilmeZamani(LocalDateTime gonderilmeZamani) {
		this.gonderilmeZamani = gonderilmeZamani;
	}

	@Column(name = "siparis_numarasi")
	private Integer siparisNumarasi;
	
	public Integer getSiparisNumarasi() {
		return this.siparisNumarasi;
	}
	
	public void setSiparisNumarasi(Integer siparisNumarasiSayaci) {
		this.siparisNumarasi = siparisNumarasiSayaci;
	}
	
	
}
