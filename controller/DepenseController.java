package Back_end.controller;

import Back_end.model.Depense;
import Back_end.service.DepenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/depenses")
@CrossOrigin(origins = "http://localhost:4200")
public class DepenseController {
    @Autowired
    private DepenseService depenseService;

    @GetMapping
    public List<Depense> getAllDepenses() {
        return depenseService.getAllDepenses();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Depense> getDepenseById(@PathVariable String id) {
        return depenseService.getDepenseById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/statut/{statut}")
    public List<Depense> getDepensesByStatut(@PathVariable String statut) {
        return depenseService.getDepensesByStatut(statut);
    }

    @GetMapping("/categorie/{categorie}")
    public List<Depense> getDepensesByCategorie(@PathVariable String categorie) {
        return depenseService.getDepensesByCategorie(categorie);
    }

    @GetMapping("/budget/{budgetId}")
    public List<Depense> getDepensesByBudgetId(@PathVariable String budgetId) {
        return depenseService.getDepensesByBudgetId(budgetId);
    }

    @PostMapping
    public Depense addDepense(@RequestBody Depense depense) {
        return depenseService.addDepense(depense);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Depense> updateDepense(@PathVariable String id, @RequestBody Depense depenseDetails) {
        try {
            Depense updatedDepense = depenseService.updateDepense(id, depenseDetails);
            return ResponseEntity.ok(updatedDepense);
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDepense(@PathVariable String id) {
        depenseService.deleteDepense(id);
        return ResponseEntity.noContent().build();
    }
} 