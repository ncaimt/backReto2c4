/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.repositories;

import com.example.demo.models.Laptop;
import com.example.demo.repositories.CRUD.ILaptopCrudRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author nacai
 */
@Repository
public class LaptopRepository {
    
    
    @Autowired
    private ILaptopCrudRepository crudLaptopRepository;
    
        public List<Laptop> getAll() {
        return crudLaptopRepository.findAll();        
    }
    
    public Optional<Laptop> getById(Integer id) {
        
        return crudLaptopRepository.findById(id);
    }

    public Laptop save(Laptop laptop) {
        return crudLaptopRepository.save(laptop);
    }
    
    public void update(Laptop laptop) {
        crudLaptopRepository.save(laptop);
    }
    
    public void delete(Integer id) {
        crudLaptopRepository.deleteById(id);
    }
}
