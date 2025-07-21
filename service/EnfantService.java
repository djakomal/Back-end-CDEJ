package Back_end.service;

import Back_end.model.Enfant;
import Back_end.repository.EnfantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EnfantService {

    @Autowired
    private EnfantRepository enfantRepository;

    public List<Enfant> getAllEnfants() {
        return enfantRepository.findAll();
    }

    public Optional<Enfant> getEnfantById(String id) {
        return enfantRepository.findById(id);
    }

    public Enfant createEnfant(Enfant enfant) {
        return enfantRepository.save(enfant);
    }

    public Enfant updateEnfant(String id, Enfant enfantDetails) {
        Enfant enfant = enfantRepository.findById(id).orElseThrow(() -> new RuntimeException("Enfant not found with id " + id));

        enfant.setNumero(enfantDetails.getNumero());
        enfant.setNom(enfantDetails.getNom());
        enfant.setPrenom(enfantDetails.getPrenom());
        enfant.setAge(enfantDetails.getAge());
        enfant.setClasse(enfantDetails.getClasse());
        enfant.setResultat_annee(enfantDetails.getResultat_annee());
        enfant.setParrainId(enfantDetails.getParrainId());
        enfant.setRisqueExclusion(enfantDetails.isRisqueExclusion());

        return enfantRepository.save(enfant);
    }

    public void deleteEnfant(String id) {
        enfantRepository.deleteById(id);
    }
} 