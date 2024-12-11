package com.cnss.portail.controller;

import com.cnss.portail.model.Admin;
import com.cnss.portail.repository.AdminRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/portail-cnss/auth")
public class AuthController {

    private final AdminRepository adminRepository;

    public AuthController(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginRequest loginRequest) {
        Optional<Admin> adminOpt = adminRepository.findByEmail(loginRequest.getEmail());

        if (adminOpt.isPresent() && adminOpt.get().getPassword().equals(loginRequest.getPassword())) {
            Admin admin = adminOpt.get();
            return ResponseEntity.ok(new AdminResponse(admin.getId(), admin.getEmail(), admin.getNom(), admin.getInpe(),
                    admin.getTelephone(), admin.getVille(), admin.getAdresse()));
        } else {
            return ResponseEntity.status(401).body("Invalid email or password");
        }
    }

    // Classe interne pour le modèle de requête
    public static class LoginRequest {
        private String email;
        private String password;

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }
    }

    // Classe interne pour la réponse
    @AllArgsConstructor
    public static class AdminResponse {
        private Long id;
        private String email;
        private String nom;
        private String inpe;
        private String telephone;
        private String ville;
        private String adresse;

        public AdminResponse(Long id, String email) {
            this.id = id;
            this.email = email;
        }

        public Long getId() {
            return id;
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

        public String getEmail() {
            return email;
        }
    }
}