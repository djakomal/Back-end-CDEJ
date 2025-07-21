package Back_end.repository;

import Back_end.model.Lettre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface LettreRepository extends JpaRepository<Lettre, String> {
    List<Lettre> findByEnfantId(String enfantId);
} 