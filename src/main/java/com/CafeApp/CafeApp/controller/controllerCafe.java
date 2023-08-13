package com.CafeApp.CafeApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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
import com.CafeApp.CafeApp.SiparisEkrani.repo.repoSiparisDetaylari;

import java.util.List;

@Controller
public class controllerCafe {

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


    @GetMapping("/all")
    public String ShowAll(Model model){
        List<modelEkstralar> ekstralarList = EkstralarRepo.getAllEkstralar();
        List<modelFiltreKahveler> filtreKahvelerList = FiltreKahvelerRepo.getAllFiltreKahveler();
        List<modelEspressoKahveler> espressoKahvelerList  = EspressoKahvelerRepo.getAllEspressoKahveler();
        List<modelTurkKahveler> turkKahvelerList = TürkKahvelerRepo.getAllTurkKahveler();
        List<modelSogukEspressoKahveler> sogukEspressoKahvelerList = SogukEspressoKahvelerRepo.getAllSogukEspressoKahveler();
        model.addAttribute("filtreKahvelerList", filtreKahvelerList);
        model.addAttribute("ekstralarList", ekstralarList);
        model.addAttribute("espressoKahvelerList", espressoKahvelerList);
        model.addAttribute("turkKahvelerList", turkKahvelerList);
        model.addAttribute("sogukEspressoKahvelerList", sogukEspressoKahvelerList);
        return "allView.html";
    }
}

