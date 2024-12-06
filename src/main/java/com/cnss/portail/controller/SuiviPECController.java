package com.cnss.portail.controller;

import com.cnss.portail.model.SuiviPEC;
import com.cnss.portail.service.SuiviPECService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("api/portail-cnss/suivi-pec")
public class SuiviPECController {
    private final SuiviPECService suiviPECService;

    public SuiviPECController(SuiviPECService suiviPECService) {
        this.suiviPECService = suiviPECService;
    }

    @GetMapping("/all/{matricule}")
    public List<SuiviPEC> getAllSuiviPECByMatricule(@PathVariable("matricule") String matricule) {
        List<SuiviPEC> list = suiviPECService.findSuiviPECByMatricule(matricule);
        return list;
    }
}
