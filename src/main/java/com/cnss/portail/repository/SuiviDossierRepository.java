package com.cnss.portail.repository;

import com.cnss.portail.model.SuiviDossier;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SuiviDossierRepository extends JpaRepository<SuiviDossier, Long> {
    List<SuiviDossier> findAllByAssure_Matricule(String matricule);
}
