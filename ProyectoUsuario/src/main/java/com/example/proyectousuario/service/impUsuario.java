package com.example.proyectousuario.service;

import com.example.proyectousuario.entity.Usuario;
import com.example.proyectousuario.dao.daoUsuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

@Service
public class impUsuario implements serUsuario{
    @Autowired
    private daoUsuario dao;
    @Override
    @Transactional(readOnly = true)
    public List<Usuario> findAll() {
        return (List<Usuario>) dao.findAll();
    }

    @Override
    public Usuario save(Usuario usuario) {
        return dao.save(usuario);
    }

    @Override
    @Transactional(readOnly = true)
    public Usuario findById(Long id) {
        return dao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        dao.deleteById(id);
    }
}
