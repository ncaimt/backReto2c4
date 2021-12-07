/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.services;

import com.example.demo.models.Laptop;
import com.example.demo.repositories.LaptopRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author nacai
 */
@Service
public class LaptopService {

    @Autowired
    private LaptopRepository repositorio;

    public List<Laptop> listar() {
        return repositorio.getAll();
    }

    public Laptop create(Laptop laptop) {
        if (laptop.getId() == null) {
            return laptop;
        }
        return repositorio.save(laptop);

    }

    public Laptop update(Laptop laptop) {

        if (laptop.getId() != null) {
            Optional<Laptop> laptopDb = repositorio.getById(laptop.getId());
            if (laptopDb.isPresent()) {
                if (laptop.getBrand() != null) {
                    laptopDb.get().setBrand(laptop.getBrand());
                }
                if (laptop.getModel() != null) {
                    laptopDb.get().setModel(laptop.getModel());
                }
                if (laptop.getProcesor() != null) {
                    laptopDb.get().setProcesor(laptop.getProcesor());
                }
                if (laptop.getOs() != null) {
                    laptopDb.get().setOs(laptop.getOs());
                }
                if (laptop.getDescription() != null) {
                    laptopDb.get().setDescription(laptop.getDescription());
                }
                if (laptop.getMemory() != null) {
                    laptopDb.get().setMemory(laptop.getMemory());
                }
                if (laptop.getHardDrive() != null) {
                    laptopDb.get().setHardDrive(laptop.getHardDrive());
                }
                if (laptop.isAvailability() != false || laptop.isAvailability() != true) {
                    // en caso que sea un valor incorrecto, o sea si es diferente de true or false
                    //entonces es un valor invalido
                    laptopDb.get().setAvailability(laptop.isAvailability());
                }
                if (laptop.getPhotography() != null) {
                    laptopDb.get().setPhotography(laptop.getPhotography());
                }

                laptopDb.get().setPrice(laptop.getPrice());
                laptopDb.get().setQuantity(laptop.getQuantity());

                repositorio.update(laptopDb.get());
                return laptopDb.get();
            } else {
                return laptop;
            }
        } else {
            return laptop;
        }
    }

    
    public boolean delete(int userId) {
        Optional<Laptop> laptop = repositorio.getById(userId);
        
        if (!laptop.isPresent()){
            return false;
        }else{
            repositorio.delete(userId);
            return true;
        }
    }
    
}
