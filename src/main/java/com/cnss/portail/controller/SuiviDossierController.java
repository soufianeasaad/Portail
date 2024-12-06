package com.cnss.portail.controller;

import com.cnss.portail.model.SuiviDossier;
import com.cnss.portail.service.SuiviDossierService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("api/portail-cnss/suivi-dossier")
public class SuiviDossierController {
    private final SuiviDossierService suiviDossierService;

    public SuiviDossierController(SuiviDossierService suiviDossierService) {
        this.suiviDossierService = suiviDossierService;
    }


    @GetMapping("/all/{matricule}")
    public List<SuiviDossier> getAllDossierByMatricule(@PathVariable("matricule") String matricule) {
        return suiviDossierService.findAllDossierByMatricule(matricule);
    }
}
