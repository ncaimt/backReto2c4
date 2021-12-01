/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.repositories;

import com.example.demo.models.Usuario;
import com.example.demo.repositories.CRUD.IUsuarioCrudRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author nacai
 */
@Repository
public class UsuarioRepository {
    
    @Autowired
    private IUsuarioCrudRepository crudUsuarioRepository;
    
    public List<Usuario> listar() {
        return crudUsuarioRepository.findAll();        
    }
    
    
    
    public boolean existeEmail(String email){
        Optional<Usuario> usuarioX = crudUsuarioRepository.findByEmail(email);
        return usuarioX.isPresent();
    }
    
    public Usuario autenticarUsuario(String email, String password ){
        Optional<Usuario> usuarioX = crudUsuarioRepository.findByEmailAndPassword(email, password);
        if(!usuarioX.isPresent()){
            return new Usuario();
        }
        else{
        return usuarioX.get();
        }
    }

   
    
    public Optional<Usuario> getById(Integer id) {
        
        return crudUsuarioRepository.findById(id);
    }

    public Usuario save(Usuario usuario) {
        return crudUsuarioRepository.save(usuario);
    }
    
    public void update(Usuario usuario){
        crudUsuarioRepository.save(usuario);
    }
    
    public void delete(Integer id) {
        crudUsuarioRepository.deleteById(id);
    }
    
}
