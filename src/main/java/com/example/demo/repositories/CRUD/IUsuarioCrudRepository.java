/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.demo.repositories.CRUD;

import com.example.demo.models.Usuario;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author nacai
 */


public interface IUsuarioCrudRepository extends MongoRepository<Usuario, Integer>{
    
    Optional<Usuario> findByEmail (String email);
    
    Optional<Usuario> findByEmailAndPassword (String email, String password);
    
   
}
