package com.cnss.portail.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class SuiviPEC {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String numeroPEC;
    private LocalDate dateReception;
     private double montantDemende;
    private double montantAccorde;
    private String situationPEC;
    private LocalDate dateSituattion;

    @ManyToOne
    @JoinColumn(name = "assure_id")
    private Assure assure;

}
