package com.cnss.portail.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor @NoArgsConstructor
@Data
@Entity
public class Assure {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String numero_tele;
    private LocalDate date_naissance;
    private String cin;
    private String matricule;

    @OneToMany(mappedBy = "assure")
    @JsonIgnore
    private List<SuiviPEC> suiviPECS;

    /*@OneToMany(mappedBy = "assure")
    @JsonIgnore
    private List<Droit> droits;*/

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "droit_id")
    private Droit droit;

    @OneToMany(mappedBy = "assure")
    @JsonIgnore()
    private List<Ayantdroit> ayantdroits;

    @OneToMany(mappedBy = "assure")
    @JsonIgnore()
    private List<SuiviDossier> suiviDossiers;


}