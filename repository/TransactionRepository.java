package Back_end.repository;

import Back_end.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, String> {
    List<Transaction> findByType(String type);
    List<Transaction> findByCategorie(String categorie);
} 