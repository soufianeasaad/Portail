package com.cnss.portail.controller;

import com.cnss.portail.model.Assure;
import com.cnss.portail.service.AssureService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("api/portail-cnss/assure")
public class AssureController {
    private final AssureService assureService;


    public AssureController(AssureService assureService) {
        this.assureService = assureService;
    }

    @GetMapping("/all")
    public List<Assure> getAllAssure() {
        System.out.println("test------------------");
        return assureService.getAllAssures();

    }

    @GetMapping("/find/{cin}")
    public Assure getAssureByCin(@PathVariable("cin") String cin) {
        return assureService.getAssureByCin(cin);
    }
}
