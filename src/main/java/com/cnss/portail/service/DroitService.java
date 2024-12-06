package com.cnss.portail.service;

import com.cnss.portail.model.Droit;
import com.cnss.portail.repository.DroitRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DroitService {
    private final DroitRepository droitRepository;

    public DroitService(DroitRepository droitRepository) {
        this.droitRepository = droitRepository;
    }

   /* public List<Droit> findAllDroitByMatricule(String matricule){
        return droitRepository.findAllByAssure_Matricule(matricule);
    }*/


}
