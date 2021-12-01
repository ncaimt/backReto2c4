/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.services;

import com.example.demo.models.Usuario;
import com.example.demo.repositories.UsuarioRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author nacai
 */
@Service
public class UsuarioServicio {
    @Autowired
    private UsuarioRepository repositorio;
    
    public List<Usuario> listar(){
        return repositorio.listar();
        
    }
    
    public boolean existeEmail(String email){
        return repositorio.existeEmail(email);       
    }
    
    public Usuario autenticarUsuario(String email, String password ){
        return repositorio.autenticarUsuario(email, password);    
    }
    
    
    public Usuario create(Usuario usuario) {
        if (usuario.getId() == null) {
            return usuario;
        } else {
            Optional<Usuario> e = repositorio.getById(usuario.getId());
            if (!e.isPresent()) {
                if (existeEmail(usuario.getEmail()) == false) {

                     System.out.println("se creo ussuario");

                    System.out.println("se creo ussuario");

                    return repositorio.save(usuario);
                    
                } else {
                    System.out.println("no se pudo crear usuario primer else");
                    return usuario;
                    
                }
            } else {
                System.out.println("no se pudo crear usuario segundo else");
                return usuario;
            }
        }
    }
    
    
    public Usuario update(Usuario usuario) {

        if (usuario.getId() != null) {
            Optional<Usuario> usuarioDb = repositorio.getById(usuario.getId());
            if (usuarioDb.isPresent()) {
                if (usuario.getIdentification() != null) {
                    usuarioDb.get().setIdentification(usuario.getIdentification());
                }
                if (usuario.getName() != null) {
                    usuarioDb.get().setName(usuario.getName());
                }
                if (usuario.getAddress() != null) {
                    usuarioDb.get().setAddress(usuario.getAddress());
                }
                if (usuario.getCellPhone() != null) {
                    usuarioDb.get().setCellPhone(usuario.getCellPhone());
                }
                if (usuario.getEmail() != null) {
                    usuarioDb.get().setEmail(usuario.getEmail());
                }
                if (usuario.getPassword() != null) {
                    usuarioDb.get().setPassword(usuario.getPassword());
                }
                if (usuario.getZone() != null) {
                    usuarioDb.get().setZone(usuario.getZone());
                }

                repositorio.update(usuarioDb.get());
                return usuarioDb.get();
            } else {
                return usuario;
            }
        } else {
            return usuario;
        }
    }
    
    
    public boolean delete(int userId) {
        Optional<Usuario> usuario = repositorio.getById(userId);
        
        if (!usuario.isPresent()){
            return false;
        }else{
            repositorio.delete(userId);
            return true;
        }
    }
    
}
