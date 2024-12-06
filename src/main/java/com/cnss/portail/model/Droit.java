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
public class Droit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private LocalDate dateDebut;
    private LocalDate dateFin;
    private String statut; // Exemple : "ouvert", "suspendu", "fermé"
    private String description;

    /*@ManyToOne
    @JoinColumn(name = "assure_id")
    private Assure assure;*/

}
