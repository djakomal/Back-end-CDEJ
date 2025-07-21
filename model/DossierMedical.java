package Back_end.model;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import java.time.LocalDate;
import java.util.List;

@Entity
public class DossierMedical {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String enfant_id;
    private String enfant_nom;
    private String enfant_prenom;
    private LocalDate date_consultation;
    private String type_consultation;
    private String symptomes;
    private String diagnostic;
    private String traitement;
    @ElementCollection
    private List<String> medicaments;
    private int duree_traitement;
    private double cout_consultation;
    private double cout_medicaments;
    private double cout_total;
    private String statut;
    private String notes_medecin;
    private LocalDate prochaine_visite;
    private String agent_medical;

    // Getters et Setters
    // ... (pour chaque champ)
    // Pour la lisibilité, je peux générer les getters/setters sur demande
} 