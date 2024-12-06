package com.cnss.portail.service;

import com.cnss.portail.model.SuiviPEC;
import com.cnss.portail.repository.SuiviPECRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SuiviPECService {
    private final SuiviPECRepository suiviPECRepository;

    public SuiviPECService(SuiviPECRepository suiviPECRepository) {
        this.suiviPECRepository = suiviPECRepository;
    }


    public List<SuiviPEC> findSuiviPECByMatricule(String matricule) {
        List<SuiviPEC> listPEC = suiviPECRepository.findAllByAssure_Matricule(matricule);
        return listPEC;
    }

}
