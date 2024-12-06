package com.cnss.portail.repository;

import com.cnss.portail.model.Droit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DroitRepository extends JpaRepository<Droit, Long> {

    //List<Droit> findAllByAssure_Matricule(String matricule);
}
