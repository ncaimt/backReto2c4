/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author nacai
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "usuarios")

public class Usuario {
    
@Id
private Integer id;
private String identification;
private String name;
private String address;
private String cellPhone;
private String email;
private String password;
private String zone;
private String type;
    
}
