package ch.hearc.jee2024.hellospring;

import ch.hearc.jee2024.hellospring.service.Biere;
import ch.hearc.jee2024.hellospring.service.BiereService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/beer")
public class BiereController {

    private BiereService biereService;
    public BiereController(BiereService biereService){
        this.biereService = biereService;
    }
    @PostMapping
    public ResponseEntity<Biere> creerBiere(@RequestBody Biere biere){
        Biere createdBiere = this.biereService.creerBiere(biere);
        return ResponseEntity.status(201).body(biere);
    }
}
