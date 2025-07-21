package Back_end.service;

import Back_end.model.DossierMedical;
import Back_end.repository.DossierMedicalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DossierMedicalService {
    @Autowired
    private DossierMedicalRepository dossierMedicalRepository;

    public List<DossierMedical> getAllDossiers() {
        return dossierMedicalRepository.findAll();
    }

    public Optional<DossierMedical> getDossierById(String id) {
        return dossierMedicalRepository.findById(id);
    }

    public List<DossierMedical> getDossiersByEnfantId(String enfant_id) {
        return dossierMedicalRepository.findByEnfant_id(enfant_id);
    }

    public DossierMedical addDossier(DossierMedical dossier) {
        return dossierMedicalRepository.save(dossier);
    }

    public DossierMedical updateDossier(String id, DossierMedical dossierDetails) {
        DossierMedical dossier = dossierMedicalRepository.findById(id).orElseThrow(() -> new RuntimeException("Dossier not found with id " + id));
        // Set all fields from dossierDetails to dossier (à compléter selon les besoins)
        return dossierMedicalRepository.save(dossier);
    }

    public void deleteDossier(String id) {
        dossierMedicalRepository.deleteById(id);
    }
} 