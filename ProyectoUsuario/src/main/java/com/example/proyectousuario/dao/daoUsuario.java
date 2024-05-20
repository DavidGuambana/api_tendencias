package com.example.proyectousuario.dao;

import com.example.proyectousuario.entity.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface daoUsuario extends CrudRepository<Usuario, Long> {

}