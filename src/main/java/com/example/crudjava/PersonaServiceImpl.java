package com.example.crudjava;

import com.example.crudjava.modelo.Persona;
import com.example.crudjava.repository.PersonaRepository;
import com.example.crudjava.service.PersonaService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaServiceImpl implements PersonaService {
    @Autowired
    private PersonaRepository personaRepository;



    @Override
    public List<Persona> listar() {

        return personaRepository.findAll();

    }

    @Override
    public Persona listarId(int id) {

        return personaRepository.findById(id);
    }

    @Override
    public Persona add(Persona p) {
        return personaRepository.save(p);
    }

    @Override
    public Persona edit(Persona p) {
        return personaRepository.save(p);
    }

    @Override
    public Persona delete(int id) {
        Persona p = personaRepository.findById(id);
        if (p != null) {
            personaRepository.delete(p);
        }
        return p;
    }

    public Persona cambiarEstado(int id) {
        Persona persona = personaRepository.findById(id);
        if (persona != null) {
            persona.setEstado("Retirado");
            return personaRepository.save(persona);
        }
        return  null;
    }
}
