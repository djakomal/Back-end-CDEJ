package Back_end.service;

import Back_end.model.Budget;
import Back_end.repository.BudgetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BudgetService {
    @Autowired
    private BudgetRepository budgetRepository;

    public List<Budget> getAllBudgets() {
        return budgetRepository.findAll();
    }

    public Optional<Budget> getBudgetById(String id) {
        return budgetRepository.findById(id);
    }

    public List<Budget> getBudgetsByCategorie(String categorie) {
        return budgetRepository.findByCategorie(categorie);
    }

    public List<Budget> getBudgetsByAnnee(int annee) {
        return budgetRepository.findByAnnee(annee);
    }

    public Budget addBudget(Budget budget) {
        return budgetRepository.save(budget);
    }

    public Budget updateBudget(String id, Budget budgetDetails) {
        Budget budget = budgetRepository.findById(id).orElseThrow(() -> new RuntimeException("Budget not found with id " + id));
        budget.setAnnee(budgetDetails.getAnnee());
        budget.setMois(budgetDetails.getMois());
        budget.setCategorie(budgetDetails.getCategorie());
        budget.setMontantAlloue(budgetDetails.getMontantAlloue());
        budget.setMontantUtilise(budgetDetails.getMontantUtilise());
        budget.setMontantRestant(budgetDetails.getMontantRestant());
        budget.setStatut(budgetDetails.getStatut());
        budget.setDateCreation(budgetDetails.getDateCreation());
        budget.setDateModification(budgetDetails.getDateModification());
        budget.setDescription(budgetDetails.getDescription());
        return budgetRepository.save(budget);
    }

    public void deleteBudget(String id) {
        budgetRepository.deleteById(id);
    }
} 