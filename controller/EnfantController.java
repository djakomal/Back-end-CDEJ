package Back_end.controller;

import Back_end.model.Enfant;
import Back_end.service.EnfantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/enfants")
@CrossOrigin(origins = "http://localhost:4200")
public class EnfantController {

    @Autowired
    private EnfantService enfantService;

    @GetMapping
    public List<Enfant> getAllEnfants() {
        return enfantService.getAllEnfants();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Enfant> getEnfantById(@PathVariable String id) {
        return enfantService.getEnfantById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Enfant createEnfant(@RequestBody Enfant enfant) {
        return enfantService.createEnfant(enfant);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Enfant> updateEnfant(@PathVariable String id, @RequestBody Enfant enfantDetails) {
        try {
            Enfant updatedEnfant = enfantService.updateEnfant(id, enfantDetails);
            return ResponseEntity.ok(updatedEnfant);
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEnfant(@PathVariable String id) {
        enfantService.deleteEnfant(id);
        return ResponseEntity.noContent().build();
    }
} 