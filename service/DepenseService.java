package Back_end.service;

import Back_end.model.Depense;
import Back_end.repository.DepenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepenseService {
    @Autowired
    private DepenseRepository depenseRepository;

    public List<Depense> getAllDepenses() {
        return depenseRepository.findAll();
    }

    public Optional<Depense> getDepenseById(String id) {
        return depenseRepository.findById(id);
    }

    public List<Depense> getDepensesByStatut(String statut) {
        return depenseRepository.findByStatut(statut);
    }

    public List<Depense> getDepensesByCategorie(String categorie) {
        return depenseRepository.findByCategorie(categorie);
    }

    public List<Depense> getDepensesByBudgetId(String budgetId) {
        return depenseRepository.findByBudgetId(budgetId);
    }

    public Depense addDepense(Depense depense) {
        return depenseRepository.save(depense);
    }

    public Depense updateDepense(String id, Depense depenseDetails) {
        Depense depense = depenseRepository.findById(id).orElseThrow(() -> new RuntimeException("Depense not found with id " + id));
        depense.setBudgetId(depenseDetails.getBudgetId());
        depense.setCategorie(depenseDetails.getCategorie());
        depense.setMontant(depenseDetails.getMontant());
        depense.setDescription(depenseDetails.getDescription());
        depense.setDateDepense(depenseDetails.getDateDepense());
        depense.setStatut(depenseDetails.getStatut());
        depense.setJustificatif(depenseDetails.getJustificatif());
        depense.setValidePar(depenseDetails.getValidePar());
        depense.setDateValidation(depenseDetails.getDateValidation());
        depense.setMotifRejet(depenseDetails.getMotifRejet());
        return depenseRepository.save(depense);
    }

    public void deleteDepense(String id) {
        depenseRepository.deleteById(id);
    }
} 