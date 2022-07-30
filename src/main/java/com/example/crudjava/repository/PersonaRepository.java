package com.example.crudjava.repository;

import com.example.crudjava.modelo.Persona;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PersonaRepository extends CrudRepository<Persona, Integer> {

    List<Persona> findAll();

    Persona findById(int id);

    Persona save(Persona p);

    void delete(Persona p);



}

