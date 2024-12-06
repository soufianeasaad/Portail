package com.cnss.portail.service;

import com.cnss.portail.model.Ayantdroit;
import com.cnss.portail.repository.AyantDroitRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AyantDroitService {
    private final AyantDroitRepository ayantDroitRepository;

    public AyantDroitService(AyantDroitRepository ayantDroitRepository) {
        this.ayantDroitRepository = ayantDroitRepository;
    }

    public List<Ayantdroit> findAllAyantDroitByMatricule(String matricule) {

        return ayantDroitRepository.findAllByAssure_Matricule(matricule);
    }
}
