package com.example.demo;

import com.example.demo.models.Usuario;
import com.example.demo.repositories.CRUD.IUsuarioCrudRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
    @Autowired
    private IUsuarioCrudRepository usuarioRepo;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        
        usuarioRepo.deleteAll();
        
        /* esta parte es para probar metodos del crud antes de implementar el controller
        usuarioRepo.saveAll(List.of(
                
                new Usuario(1, "123456", "Alan Parrish",  "CR 34-45",  "311222222", "jumanjit1@gmail.com", "Demo123.", "ZONA 1", "COORD"), 
                new Usuario(2, "45687", "Harry Potter",  "CR 34-45",  "311222222", "jumanjt2@gmail.com", "Demo123.", "ZONA 2", "ADM"),   
                new Usuario(3, "7894", "Sherlock Holmes",  "CR 34-45",  "311222222", "jumanjt3@gmail.com", "Demo123.", "ZONA 3", "ASE"),             
                new Usuario(4, "121545", "Alex Xelder",  "CR 34-45",  "311222222", "jumanjit4@gmail.com", "Demo123.", "ZONA 4", "COORD")           
        ));
        System.out.println("Listado de usuarios");
        usuarioRepo.findAll().forEach(System.out::println);
        
        
        // probar metodos de email
        
        Optional <Usuario> usuario1 = usuarioRepo.findByEmail("jumanjit1@gmail.comx");
        
        if (usuario1.isEmpty()){
            System.out.println("Email no coincide");
            }
        else {   
            System.out.println("Datos del usuario C: "+ usuario1.get());
        }
        
        Optional <Usuario> usuario2 = usuarioRepo.findByEmailAndPassword("jumanjit4@gmail.com", "Demo123.");
        if (usuario2.isEmpty()){
            System.out.println("Email y/0 contrasena no coinciden");
            }
        else {   
            System.out.println("Datos del usuario C+P: "+ usuario2.get());
        }
            
    */
    }    
}