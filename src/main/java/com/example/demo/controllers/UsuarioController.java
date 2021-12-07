/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.controllers;

import com.example.demo.models.Usuario;
import com.example.demo.services.UsuarioServicio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author nacai
 */
@RestController
@RequestMapping("api/user")
@CrossOrigin("*")
public class UsuarioController {
    
    @Autowired
    private UsuarioServicio servicio;
    
    @GetMapping("/all")
    public List<Usuario> listar(){
        return servicio.listar();
        
    }
    
    @GetMapping("/emailexist/{email}")
    public boolean existeEmail(@PathVariable String email){
        return servicio.existeEmail(email);   
    }
    
    @GetMapping("/{email}/{password}")
    public Usuario autenticarUsuario(@PathVariable String email, @PathVariable String password ){
        return servicio.autenticarUsuario(email, password);   
    }
    
    @PostMapping("/new")
    @ResponseStatus(HttpStatus.CREATED)
    public Usuario create(@RequestBody Usuario usuario) {
        return servicio.create(usuario);
    }
    
    @PutMapping("/update")
    @ResponseStatus(HttpStatus.OK)
    public Usuario update(@RequestBody Usuario usuario) {
        return servicio.update(usuario);
    }
    
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable int id){
        return servicio.delete(id);
    }
    
    
    

}




