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
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "laptops")
public class Laptop {
    
@Id
private Integer id;
private String brand;
private String model;
private String procesor;
private String os;
private String description;
private String memory;
private String hardDrive;
private boolean availability = true;
private double price;
private int quantity;
private String photography;
}
