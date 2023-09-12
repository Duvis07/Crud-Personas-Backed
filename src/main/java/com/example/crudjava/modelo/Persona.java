package com.example.crudjava.modelo;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "persona")
public class Persona {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String nombre;
    @Column
    private String apellido;
    @Column
    private String edad;
    @Column
    private String nacionalidad;
    @Column
    private String estado = "Activo";


}
