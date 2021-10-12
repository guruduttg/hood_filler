package com.javatechie.crud.example.repository;

import com.javatechie.crud.example.entity.Hoodfiller;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HoodfillerRepository extends JpaRepository<Hoodfiller,Integer> {
	Hoodfiller findByName(String name);
}

