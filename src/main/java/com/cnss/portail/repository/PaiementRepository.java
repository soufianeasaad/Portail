package com.cnss.portail.repository;

import com.cnss.portail.model.Assure;
import com.cnss.portail.model.Paiement;
import com.cnss.portail.model.SuiviDossier;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PaiementRepository extends JpaRepository<Paiement, Long> {
    List<Paiement> findAllBySuiviDossier_Assure_Matricule(String matricule);
}
