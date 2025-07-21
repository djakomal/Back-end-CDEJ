package Back_end.controller;

import Back_end.model.Gift;
import Back_end.service.GiftService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/gifts")
@CrossOrigin(origins = "http://localhost:4200")
public class GiftController {
    @Autowired
    private GiftService giftService;

    @GetMapping
    public List<Gift> getAllGifts() {
        return giftService.getAllGifts();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Gift> getGiftById(@PathVariable String id) {
        return giftService.getGiftById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/enfant/{enfantId}")
    public List<Gift> getGiftsByEnfantId(@PathVariable String enfantId) {
        return giftService.getGiftsByEnfantId(enfantId);
    }

    @PostMapping
    public Gift addGift(@RequestBody Gift gift) {
        return giftService.addGift(gift);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteGift(@PathVariable String id) {
        giftService.deleteGift(id);
        return ResponseEntity.noContent().build();
    }
} 