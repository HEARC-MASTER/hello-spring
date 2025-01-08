package ch.hearc.jee2024.hellospring.service;

import ch.hearc.jee2024.hellospring.repository.BiereRepository;
import org.springframework.stereotype.Service;

@Service
public class BiereServiceImpl implements BiereService{

    private BiereRepository biereRepository;
    public BiereServiceImpl(BiereRepository biereRepository){
        this.biereRepository = biereRepository;
    }

    public Biere creerBiere(Biere biere){
        return this.biereRepository.saveBiere(biere);
    }
}
