package com.cnss.portail.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor @NoArgsConstructor
@Entity
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String password;

    private String nom;
    private String inpe;
    private String telephone;
    private String ville;
    private String adresse;

    public Long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getNom() {
        return nom;
    }

    public String getInpe() {
        return inpe;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getVille() {
        return ville;
    }

    public String getAdresse() {
        return adresse;
    }
}