package com.example.crudjava.repository;

import com.example.crudjava.modelo.Persona;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface PersonaRepository extends CrudRepository<Persona, Integer> {

    List<Persona> findAll();

    Persona findById(int id);

    Persona save(Persona p);

    void delete(Persona p);

    Optional<Persona> findById(Long id);
}

