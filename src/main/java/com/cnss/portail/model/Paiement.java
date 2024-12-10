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
public class Paiement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double montantPaye;
    private LocalDate dateSoin;
    private String situation;
    private LocalDate datePaiement;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "suivi_dossier_id")
    private SuiviDossier suiviDossier;

    @ManyToOne()
    @JoinColumn(name = "suivi_pec_id")
    private SuiviPEC suiviPEC;

}
