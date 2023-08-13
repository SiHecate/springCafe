package com.CafeApp.CafeApp.SiparisEkrani.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.CafeApp.CafeApp.Mutfak.Ekstralar.Model.modelEkstralar;
import com.CafeApp.CafeApp.Mutfak.Ekstralar.Repo.repoEkstralar;
import com.CafeApp.CafeApp.Mutfak.İçecekler.EspressoKahve.Model.modelEspressoKahveler;
import com.CafeApp.CafeApp.Mutfak.İçecekler.EspressoKahve.Repo.repoEspressoKahveler;
import com.CafeApp.CafeApp.Mutfak.İçecekler.FiltreKahve.Model.modelFiltreKahveler;
import com.CafeApp.CafeApp.Mutfak.İçecekler.FiltreKahve.Repo.repoFiltreKahveler;
import com.CafeApp.CafeApp.Mutfak.İçecekler.SogukEspressoKahve.Model.modelSogukEspressoKahveler;
import com.CafeApp.CafeApp.Mutfak.İçecekler.SogukEspressoKahve.Repo.repoSogukEspressoKahveler;
import com.CafeApp.CafeApp.Mutfak.İçecekler.TurkKahve.Model.modelTurkKahveler;
import com.CafeApp.CafeApp.Mutfak.İçecekler.TurkKahve.Repo.repoTurkKahveler;
import com.CafeApp.CafeApp.SiparisEkrani.Model.modelSiparisDetaylari;
import com.CafeApp.CafeApp.SiparisEkrani.repo.repoSiparisDetaylari;

@Controller
public class controllerSiparisEkrani {

    @Autowired
    repoEkstralar EkstralarRepo;
    @Autowired
    repoFiltreKahveler FiltreKahvelerRepo;
    @Autowired
    repoEspressoKahveler EspressoKahvelerRepo;
    @Autowired
    repoTurkKahveler TürkKahvelerRepo;
    @Autowired
    repoSogukEspressoKahveler SogukEspressoKahvelerRepo;
    @Autowired
    repoSiparisDetaylari repoSiparisDetaylari;

    LocalDateTime now = LocalDateTime.now(); // Get the current timestamp


    @GetMapping("/SiparişlerAll")
    public String ShowSiparişAll(Model model){
        List<modelSiparisDetaylari> siparislerList = repoSiparisDetaylari.getAllSiparisDetaylari();
        model.addAttribute("siparisDetaylariList", siparislerList);

        return "SiparişlerAll.html";
    }





    @PostMapping("/siparisDetayKaydet")
    public String siparisDetayKaydet(
        @RequestParam(value = "secilenEkstralar", required = false) List<Long> secilenEkstraIdList,
        @RequestParam(value = "secilenFiltreKahveler", required = false) List<Long> secilenFiltreKahvelerIdList,
        @RequestParam(value = "secilenEspressoKahveler", required = false) List<Long> secilenEspressoKahvelerIdList,
        @RequestParam(value = "secilenTurkKahve", required = false) List<Long> secilenTurkKahveIdList,
        @RequestParam(value = "secilenSogukEspresso", required = false) List<Long> secilenSogukEspressoIdList

    ) {
    
        if (secilenEkstraIdList != null) {
            for (Long ekstraId : secilenEkstraIdList) {
                modelEkstralar ekstra = EkstralarRepo.findById(ekstraId).orElse(null);
                    modelSiparisDetaylari siparisDetayi = new modelSiparisDetaylari();
                    siparisDetayi.setUrunAdi(ekstra.getEkstraAdi());
                    siparisDetayi.setUrunFiyati(ekstra.getEkstraFiyati());
                    siparisDetayi.setGonderilmeZamani(LocalDateTime.now());
                    repoSiparisDetaylari.siparisDetaylariniKaydet(siparisDetayi);
            }
        }
    
        if (secilenFiltreKahvelerIdList != null) {
            for (Long filtreId : secilenFiltreKahvelerIdList) {
                modelFiltreKahveler filtre = FiltreKahvelerRepo.findById(filtreId).orElse(null);
                    modelSiparisDetaylari siparisDetayi = new modelSiparisDetaylari();
                    siparisDetayi.setUrunAdi(filtre.getKahve_adi());
                    siparisDetayi.setUrunFiyati(filtre.getKahve_fiyati());
                    siparisDetayi.setGonderilmeZamani(LocalDateTime.now());
                    repoSiparisDetaylari.siparisDetaylariniKaydet(siparisDetayi);
            }
        }

        if (secilenEspressoKahvelerIdList != null) {
            for (Long espressoId : secilenEspressoKahvelerIdList) {
                modelEspressoKahveler espresso = EspressoKahvelerRepo.findById(espressoId).orElse(null);
                    modelSiparisDetaylari siparisDetayi = new modelSiparisDetaylari();
                    siparisDetayi.setUrunAdi(espresso.getKahve_adi());
                    siparisDetayi.setUrunFiyati(espresso.getKahve_fiyati());
                    siparisDetayi.setGonderilmeZamani(LocalDateTime.now());
                    repoSiparisDetaylari.siparisDetaylariniKaydet(siparisDetayi);
            }
        }


        if (secilenSogukEspressoIdList != null) {
            for (Long sogukEspressoId : secilenSogukEspressoIdList) {
                modelSogukEspressoKahveler sogukEspresso = SogukEspressoKahvelerRepo.findById(sogukEspressoId).orElse(null);
                    modelSiparisDetaylari siparisDetayi = new modelSiparisDetaylari();
                    siparisDetayi.setUrunAdi(sogukEspresso.getKahve_adi());
                    siparisDetayi.setUrunFiyati(sogukEspresso.getKahve_fiyati());
                    siparisDetayi.setGonderilmeZamani(LocalDateTime.now());
                    repoSiparisDetaylari.siparisDetaylariniKaydet(siparisDetayi);
            }
        }

        if (secilenTurkKahveIdList != null) {
            for (Long turkKahveId : secilenTurkKahveIdList) {
                modelTurkKahveler turkKahve = TürkKahvelerRepo.findById(turkKahveId).orElse(null);
                    modelSiparisDetaylari siparisDetayi = new modelSiparisDetaylari();
                    siparisDetayi.setUrunAdi(turkKahve.getKahve_adi());
                    siparisDetayi.setUrunFiyati(turkKahve.getKahve_fiyati());
                    siparisDetayi.setGonderilmeZamani(LocalDateTime.now());
                    repoSiparisDetaylari.siparisDetaylariniKaydet(siparisDetayi);
            }
        }

        
        return "redirect:/all";
    }
    
}
