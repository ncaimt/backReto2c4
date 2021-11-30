/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.demo.repositories.CRUD;

import com.example.demo.models.Laptop;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author nacai
 */
public interface ILaptopCrudRepository extends MongoRepository<Laptop, Integer> {
    
}
