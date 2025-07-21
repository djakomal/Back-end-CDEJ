package Back_end.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class Enfant {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String numero;
    private String nom;
    private String prenom;
    private int age;
    private String classe;
    private String resultat_annee;
    private String parrainId;
    private boolean risqueExclusion;

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public String getResultat_annee() {
        return resultat_annee;
    }

    public void setResultat_annee(String resultat_annee) {
        this.resultat_annee = resultat_annee;
    }

    public String getParrainId() {
        return parrainId;
    }

    public void setParrainId(String parrainId) {
        this.parrainId = parrainId;
    }

    public boolean isRisqueExclusion() {
        return risqueExclusion;
    }

    public void setRisqueExclusion(boolean risqueExclusion) {
        this.risqueExclusion = risqueExclusion;
    }
} 