package com.cnss.portail.controller;

import com.cnss.portail.model.Ayantdroit;
import com.cnss.portail.service.AyantDroitService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("api/portail-cnss/ayant-droit")
public class AyantDroitController {
    private final AyantDroitService ayantDroitService;

    public AyantDroitController(AyantDroitService ayantDroitService) {
        this.ayantDroitService = ayantDroitService;
    }

    @GetMapping("/all/{matricule}")
    public List<Ayantdroit> getAllAyantDroitsByMatricule(@PathVariable("matricule") String matricule) {
        return ayantDroitService.findAllAyantDroitByMatricule(matricule);
    }
}
