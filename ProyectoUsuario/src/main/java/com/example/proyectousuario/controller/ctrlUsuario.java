package com.example.proyectousuario.controller;

import com.example.proyectousuario.entity.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import com.example.proyectousuario.service.serUsuario;

import java.util.List;

@CrossOrigin(origins= {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class ctrlUsuario {

    @Autowired
    private serUsuario ser;

    @GetMapping("/usuarios")
    public List<Usuario> listar(){
        return ser.findAll();
    }

    @GetMapping("/usuarios/{id}")
    public Usuario buscar(@PathVariable Long id) {
        return ser.findById(id);
    }

    @PostMapping("/usuarios")
    @ResponseStatus(HttpStatus.CREATED)
    public Usuario crear(@RequestBody Usuario body) {
        return ser.save(body);
    }

    @PutMapping("/usuarios/{id}")
    public Usuario actualizar(@RequestBody Usuario body, @PathVariable Long id) {
        Usuario u = ser.findById(id);
        u.setClave(body.getClave());
        u.setNombre(body.getNombre());
        u.setEmail(body.getEmail());
        u.setEstado(body.isEstado());
        return ser.save(u);
    }

    @DeleteMapping("/usuarios/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void eliminar(@PathVariable Long id) {
        ser.delete(id);
    }
}
