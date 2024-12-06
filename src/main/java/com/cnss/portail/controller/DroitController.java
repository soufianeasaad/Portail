package com.cnss.portail.controller;

import com.cnss.portail.model.Droit;
import com.cnss.portail.service.DroitService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("api/portail-cnss/droit")
public class DroitController {
    private final DroitService droitService;

    public DroitController(DroitService droitService) {
        this.droitService = droitService;
    }


   /* @GetMapping("/all/{matricule}")
    public List<Droit> getAllDroitByMatricule(@PathVariable("matricule") String matricule) {
       return droitService.findAllDroitByMatricule(matricule);
    }*/
}
