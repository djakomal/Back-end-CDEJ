package Back_end.controller;

import Back_end.model.Lettre;
import Back_end.service.LettreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/lettres")
@CrossOrigin(origins = "http://localhost:4200")
public class LettreController {
    @Autowired
    private LettreService lettreService;

    @GetMapping
    public List<Lettre> getAllLettres() {
        return lettreService.getAllLettres();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Lettre> getLettreById(@PathVariable String id) {
        return lettreService.getLettreById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/enfant/{enfantId}")
    public List<Lettre> getLettresByEnfantId(@PathVariable String enfantId) {
        return lettreService.getLettresByEnfantId(enfantId);
    }

    @PostMapping
    public Lettre addLettre(@RequestBody Lettre lettre) {
        return lettreService.addLettre(lettre);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Lettre> updateLettre(@PathVariable String id, @RequestBody Lettre lettreDetails) {
        try {
            Lettre updatedLettre = lettreService.updateLettre(id, lettreDetails);
            return ResponseEntity.ok(updatedLettre);
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteLettre(@PathVariable String id) {
        lettreService.deleteLettre(id);
        return ResponseEntity.noContent().build();
    }
} 