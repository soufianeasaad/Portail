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
public class Ayantdroit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String cin;
    private LocalDate dateNaissance;
    private String numeroIndividu;
    private String relation;

    @ManyToOne
    @JoinColumn(name = "assure_id")
    private Assure assure;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "droit_id")
    private Droit droit;
}
