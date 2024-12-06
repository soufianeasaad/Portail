package com.cnss.portail.controller;

import com.cnss.portail.model.Paiement;
import com.cnss.portail.service.PaiementService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("api/portail-cnss/paiement")
public class PaiementController {
    private final PaiementService paiementService;

    public PaiementController(PaiementService paiementService) {
        this.paiementService = paiementService;
    }

    @GetMapping("/all/{matricule}")
    public List<Paiement> getAllPaiementByMatricule(@PathVariable("matricule") String matricule){
        return paiementService.findAllPaiementsByMatricule(matricule);
    }
}
