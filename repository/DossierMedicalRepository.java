package Back_end.repository;

import Back_end.model.DossierMedical;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface DossierMedicalRepository extends JpaRepository<DossierMedical, String> {
    List<DossierMedical> findByEnfant_id(String enfant_id);
} 