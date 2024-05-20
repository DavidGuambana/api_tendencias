package com.example.proyectousuario.service;

import com.example.proyectousuario.entity.Usuario;

import java.util.List;

public interface serUsuario {
    public List<Usuario> findAll();
    public Usuario save(Usuario usuario);
    public Usuario findById(Long id);
    public void delete(Long id);
}
