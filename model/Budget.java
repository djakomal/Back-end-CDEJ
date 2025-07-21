package Back_end.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import java.time.LocalDate;

@Entity
public class Budget {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private int annee;
    private int mois;
    private String categorie;
    private double montantAlloue;
    private double montantUtilise;
    private double montantRestant;
    private String statut;
    private LocalDate dateCreation;
    private LocalDate dateModification;
    private String description;

    // Getters et Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public int getAnnee() { return annee; }
    public void setAnnee(int annee) { this.annee = annee; }
    public int getMois() { return mois; }
    public void setMois(int mois) { this.mois = mois; }
    public String getCategorie() { return categorie; }
    public void setCategorie(String categorie) { this.categorie = categorie; }
    public double getMontantAlloue() { return montantAlloue; }
    public void setMontantAlloue(double montantAlloue) { this.montantAlloue = montantAlloue; }
    public double getMontantUtilise() { return montantUtilise; }
    public void setMontantUtilise(double montantUtilise) { this.montantUtilise = montantUtilise; }
    public double getMontantRestant() { return montantRestant; }
    public void setMontantRestant(double montantRestant) { this.montantRestant = montantRestant; }
    public String getStatut() { return statut; }
    public void setStatut(String statut) { this.statut = statut; }
    public LocalDate getDateCreation() { return dateCreation; }
    public void setDateCreation(LocalDate dateCreation) { this.dateCreation = dateCreation; }
    public LocalDate getDateModification() { return dateModification; }
    public void setDateModification(LocalDate dateModification) { this.dateModification = dateModification; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
} 