package com.javatechie.crud.example.service;

import com.javatechie.crud.example.entity.Hoodfiller;
import com.javatechie.crud.example.repository.HoodfillerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HoodfillerService {
    @Autowired
    private HoodfillerRepository repository;

    public Hoodfiller saveHoodfiller(Hoodfiller hoodfiller) {
        return repository.save(hoodfiller);
    }

    public List<Hoodfiller> saveHoodfillers(List<Hoodfiller> hoodfillers) {
        return repository.saveAll(hoodfillers);
    }

    public List<Hoodfiller> getHoodfillers() {
        return repository.findAll();
    }

    public Hoodfiller getHoodfillerById(int id) {
        return repository.findById(id).orElse(null);
    }

    public Hoodfiller getHoodfillerByName(String name) {
        return repository.findByName(name);
    }

    public String deleteHoodfiller(int id) {
        repository.deleteById(id);
        return "hoodfiller removed !! " + id;
    }

    public Hoodfiller updateHoodfiller(Hoodfiller xconnect) {
    	Hoodfiller existingHoodfiller = repository.findById(xconnect.getId()).orElse(null);
        existingHoodfiller.setName(xconnect.getName());
        existingHoodfiller.setHood_capacity(xconnect.getHood_capacity());
        existingHoodfiller.setPresent_weights(xconnect.getPresent_weights());
        return repository.save(existingHoodfiller);
    }


}
