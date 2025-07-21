package Back_end.controller;

import Back_end.model.DossierMedical;
import Back_end.service.DossierMedicalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/dossiers-medicaux")
@CrossOrigin(origins = "http://localhost:4200")
public class DossierMedicalController {
    @Autowired
    private DossierMedicalService dossierMedicalService;

    @GetMapping
    public List<DossierMedical> getAllDossiers() {
        return dossierMedicalService.getAllDossiers();
    }

    @GetMapping("/{id}")
    public ResponseEntity<DossierMedical> getDossierById(@PathVariable String id) {
        return dossierMedicalService.getDossierById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/enfant/{enfant_id}")
    public List<DossierMedical> getDossiersByEnfantId(@PathVariable String enfant_id) {
        return dossierMedicalService.getDossiersByEnfantId(enfant_id);
    }

    @PostMapping
    public DossierMedical addDossier(@RequestBody DossierMedical dossier) {
        return dossierMedicalService.addDossier(dossier);
    }

    @PutMapping("/{id}")
    public ResponseEntity<DossierMedical> updateDossier(@PathVariable String id, @RequestBody DossierMedical dossierDetails) {
        try {
            DossierMedical updatedDossier = dossierMedicalService.updateDossier(id, dossierDetails);
            return ResponseEntity.ok(updatedDossier);
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDossier(@PathVariable String id) {
        dossierMedicalService.deleteDossier(id);
        return ResponseEntity.noContent().build();
    }
} 