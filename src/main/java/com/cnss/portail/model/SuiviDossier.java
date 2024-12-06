package com.cnss.portail.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class SuiviDossier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String numero;
    private LocalDate dateDepot;
    private String numeroPec;
    private double montantFacture;
    private LocalDate dateSoin;
    private String situation;
    private LocalDate dateSituation;
    private String commentaires;

    @ManyToOne
    @JoinColumn(name = "assure_id")
    private Assure assure;
}
