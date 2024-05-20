package com.example.proyectousuario.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Entity
@Data
@Table
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY )
    private Long id;

    @Column(nullable = false,length = 30)
    private String nombre;

    @Column(nullable = false,length = 30)
    private String clave;

    @Column(nullable = false,length = 60)
    private String email;

    private boolean estado;
}
