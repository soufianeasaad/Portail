package com.cnss.portail.repository;

import com.cnss.portail.model.Ayantdroit;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AyantDroitRepository extends JpaRepository<Ayantdroit, Long> {
    List<Ayantdroit> findAllByAssure_Matricule(String matricule);
}
