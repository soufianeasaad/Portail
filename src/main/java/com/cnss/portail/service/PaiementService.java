package com.cnss.portail.service;

import com.cnss.portail.model.Paiement;
import com.cnss.portail.repository.PaiementRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaiementService {
    private final PaiementRepository paiementRepository;

    public PaiementService(PaiementRepository paiementRepository) {
        this.paiementRepository = paiementRepository;
    }

    public List<Paiement> findAllPaiementsByMatricule(String matricule) {
        return paiementRepository.findAllBySuiviDossier_Assure_Matricule(matricule);
    }
}
