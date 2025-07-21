package Back_end.service;

import Back_end.model.Gift;
import Back_end.repository.GiftRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GiftService {
    @Autowired
    private GiftRepository giftRepository;

    public List<Gift> getAllGifts() {
        return giftRepository.findAll();
    }

    public Optional<Gift> getGiftById(String id) {
        return giftRepository.findById(id);
    }

    public List<Gift> getGiftsByEnfantId(String enfantId) {
        return giftRepository.findByEnfantId(enfantId);
    }

    public Gift addGift(Gift gift) {
        return giftRepository.save(gift);
    }

    public void deleteGift(String id) {
        giftRepository.deleteById(id);
    }
} 