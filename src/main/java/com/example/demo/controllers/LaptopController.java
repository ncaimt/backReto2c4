/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.controllers;

import com.example.demo.models.Laptop;
import com.example.demo.services.LaptopService;
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
@RequestMapping("api/laptop")
@CrossOrigin("*")
public class LaptopController {
    
    @Autowired
    private LaptopService servicio;
    
    @GetMapping("/all")
    public List<Laptop> listar(){
        return servicio.listar();
        
    }
    
    
    @PostMapping("/new")
    @ResponseStatus(HttpStatus.CREATED)
    public Laptop create(@RequestBody Laptop laptop) {
        return servicio.create(laptop);
    }
    
    @PutMapping("/update")
    @ResponseStatus(HttpStatus.OK)
    public Laptop update(@RequestBody Laptop laptop) {
        return servicio.update(laptop);
    }
    
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable int id){
        return servicio.delete(id);
    }
    
    
    
}
