package com.javatechie.crud.example.controller;

import com.javatechie.crud.example.entity.Hoodfiller;
import com.javatechie.crud.example.service.HoodfillerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HoodfillerController {

    @Autowired
    private HoodfillerService service;

    @PostMapping("/hoodfiller")
    public Hoodfiller addHoodfiller(@RequestBody Hoodfiller hoodfiller) {
        return service.saveHoodfiller(hoodfiller);
    }

    @PostMapping("/hoodfillers")
    public List<Hoodfiller> addHoodfillers(@RequestBody List<Hoodfiller> hoodfillers) {
        return service.saveHoodfillers(hoodfillers);
    }

    @GetMapping("/hoodfillers")
    public List<Hoodfiller> findAllHoodfillers() {
        return service.getHoodfillers();
    }

    @GetMapping("/hoodfiller/{id}")
    public Hoodfiller findHoodfillerById(@PathVariable int id) {
        return service.getHoodfillerById(id);
    }

    @GetMapping("/hoodfiller/{name}")
    public Hoodfiller findXconnectByName(@PathVariable String name) {
        return service.getHoodfillerByName(name);
    }

    @PutMapping("/update")
    public Hoodfiller updateHoodfiller(@RequestBody Hoodfiller hoodfiller) {
        return service.updateHoodfiller(hoodfiller);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteHoodfiller(@PathVariable int id) {
        return service.deleteHoodfiller(id);
    }
}
