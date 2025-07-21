package Back_end.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import java.time.LocalDate;

@Entity
public class Lettre {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String enfantId;
    private String enfantNom;
    private String enfantPrenom;
    private String destinataire;
    private String contenu;
    private LocalDate date;
    private LocalDate dateEcriture;
    private LocalDate dateEnvoi;
    private String statut;
    private String type;

    // Getters et Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getEnfantId() { return enfantId; }
    public void setEnfantId(String enfantId) { this.enfantId = enfantId; }
    public String getEnfantNom() { return enfantNom; }
    public void setEnfantNom(String enfantNom) { this.enfantNom = enfantNom; }
    public String getEnfantPrenom() { return enfantPrenom; }
    public void setEnfantPrenom(String enfantPrenom) { this.enfantPrenom = enfantPrenom; }
    public String getDestinataire() { return destinataire; }
    public void setDestinataire(String destinataire) { this.destinataire = destinataire; }
    public String getContenu() { return contenu; }
    public void setContenu(String contenu) { this.contenu = contenu; }
    public LocalDate getDate() { return date; }
    public void setDate(LocalDate date) { this.date = date; }
    public LocalDate getDateEcriture() { return dateEcriture; }
    public void setDateEcriture(LocalDate dateEcriture) { this.dateEcriture = dateEcriture; }
    public LocalDate getDateEnvoi() { return dateEnvoi; }
    public void setDateEnvoi(LocalDate dateEnvoi) { this.dateEnvoi = dateEnvoi; }
    public String getStatut() { return statut; }
    public void setStatut(String statut) { this.statut = statut; }
    public String getType() { return type; }
    public void setType(String type) { this.type = type; }
} 