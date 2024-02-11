package com.example.backend.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "reclamation")
public class Reclamation {
    @Id
    private String id;
    private String nomComplet;
    private String email;
    private String telephone;
    private String typeProjet;
    private String descriptionProjet;

    public Reclamation(String id, String nomComplet, String email, String telephone, String typeProjet, String descriptionProjet) {
        this.id = id;
        this.nomComplet = nomComplet;
        this.email = email;
        this.telephone = telephone;
        this.typeProjet = typeProjet;
        this.descriptionProjet = descriptionProjet;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNomComplet() {
        return nomComplet;
    }

    public void setNomComplet(String nomComplet) {
        this.nomComplet = nomComplet;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getTypeProjet() {
        return typeProjet;
    }

    public void setTypeProjet(String typeProjet) {
        this.typeProjet = typeProjet;
    }

    public String getDescriptionProjet() {
        return descriptionProjet;
    }

    public void setDescriptionProjet(String descriptionProjet) {
        this.descriptionProjet = descriptionProjet;
    }

    @Override
    public String toString() {
        return "Reclamation{" +
                "id='" + id + '\'' +
                ", nomComplet='" + nomComplet + '\'' +
                ", email='" + email + '\'' +
                ", telephone='" + telephone + '\'' +
                ", typeProjet='" + typeProjet + '\'' +
                ", descriptionProjet='" + descriptionProjet + '\'' +
                '}';
    }
}
