package com.cnss.portail.repository;

import com.cnss.portail.model.SuiviPEC;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SuiviPECRepository extends JpaRepository<SuiviPEC, Long> {
    List<SuiviPEC> findAllByAssure_Matricule(String matricule);
}
