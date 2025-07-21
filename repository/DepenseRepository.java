package Back_end.repository;

import Back_end.model.Depense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface DepenseRepository extends JpaRepository<Depense, String> {
    List<Depense> findByStatut(String statut);
    List<Depense> findByCategorie(String categorie);
    List<Depense> findByBudgetId(String budgetId);
} 