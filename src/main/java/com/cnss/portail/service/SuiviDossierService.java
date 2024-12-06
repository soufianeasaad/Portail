package com.cnss.portail.service;

import com.cnss.portail.model.SuiviDossier;
import com.cnss.portail.repository.SuiviDossierRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SuiviDossierService {
    private final SuiviDossierRepository suiviDossierRepository;

    public SuiviDossierService(SuiviDossierRepository suiviDossierRepository) {
        this.suiviDossierRepository = suiviDossierRepository;
    }


    public List<SuiviDossier> findAllDossierByMatricule(String matricule) {
        return suiviDossierRepository.findAllByAssure_Matricule(matricule);
    }
}
