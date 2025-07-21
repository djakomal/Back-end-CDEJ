package Back_end.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import java.time.LocalDate;

@Entity
public class Gift {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String enfantId;
    private String parrainId;
    private String description;
    private LocalDate date;

    // Getters et Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getEnfantId() { return enfantId; }
    public void setEnfantId(String enfantId) { this.enfantId = enfantId; }
    public String getParrainId() { return parrainId; }
    public void setParrainId(String parrainId) { this.parrainId = parrainId; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public LocalDate getDate() { return date; }
    public void setDate(LocalDate date) { this.date = date; }
} 