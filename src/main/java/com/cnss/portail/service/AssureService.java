package com.cnss.portail.service;

import com.cnss.portail.model.Assure;
import com.cnss.portail.repository.AssureRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssureService {
    private final AssureRepository assureRepository;

    public AssureService(AssureRepository assureRepository) {
        this.assureRepository = assureRepository;
    }

    public List<Assure> getAllAssures() {
        return assureRepository.findAll();
    }


}
