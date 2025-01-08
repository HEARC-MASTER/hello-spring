package ch.hearc.jee2024.hellospring.repository;

import ch.hearc.jee2024.hellospring.service.Biere;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.UUID;

@Repository
public class BiereRepositoryImpl implements BiereRepository{

    private HashMap<UUID, Biere> db = new HashMap<>();

    public Biere saveBiere(Biere biere){
        db.put(UUID.randomUUID(),biere);
        return biere;
    }
}
