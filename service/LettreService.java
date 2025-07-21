package Back_end.service;

import Back_end.model.Lettre;
import Back_end.repository.LettreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LettreService {
    @Autowired
    private LettreRepository lettreRepository;

    public List<Lettre> getAllLettres() {
        return lettreRepository.findAll();
    }

    public Optional<Lettre> getLettreById(String id) {
        return lettreRepository.findById(id);
    }

    public List<Lettre> getLettresByEnfantId(String enfantId) {
        return lettreRepository.findByEnfantId(enfantId);
    }

    public Lettre addLettre(Lettre lettre) {
        return lettreRepository.save(lettre);
    }

    public Lettre updateLettre(String id, Lettre lettreDetails) {
        Lettre lettre = lettreRepository.findById(id).orElseThrow(() -> new RuntimeException("Lettre not found with id " + id));
        lettre.setEnfantId(lettreDetails.getEnfantId());
        lettre.setEnfantNom(lettreDetails.getEnfantNom());
        lettre.setEnfantPrenom(lettreDetails.getEnfantPrenom());
        lettre.setDestinataire(lettreDetails.getDestinataire());
        lettre.setContenu(lettreDetails.getContenu());
        lettre.setDate(lettreDetails.getDate());
        lettre.setDateEcriture(lettreDetails.getDateEcriture());
        lettre.setDateEnvoi(lettreDetails.getDateEnvoi());
        lettre.setStatut(lettreDetails.getStatut());
        lettre.setType(lettreDetails.getType());
        return lettreRepository.save(lettre);
    }

    public void deleteLettre(String id) {
        lettreRepository.deleteById(id);
    }
} 