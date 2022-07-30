package com.example.crudjava.controller;

import com.example.crudjava.modelo.Persona;
import com.example.crudjava.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
//@RequestMapping("/personas")
public class PersonaController {

    @Autowired
    private PersonaService personaService;

    @GetMapping("/listar")
    public List<Persona> listar() {
        return personaService.listar();
    }

    @PostMapping("/add")
    public Persona agregar(@RequestBody Persona p) {
        return personaService.add(p);
    }

    @GetMapping("/listarId/{id}")
    public Persona listarId(@PathVariable int id) {
        return personaService.listarId(id);
    }

    @PutMapping("/edit/{id}")
    public Persona editar(@RequestBody Persona p ,@PathVariable ("id") int id) {
       p.setId(id);
        return personaService.edit(p);
    }

    @DeleteMapping("/delete/{id}")
    public Persona delete(@PathVariable ("id") int id) {
        return personaService.delete(id);
    }
}