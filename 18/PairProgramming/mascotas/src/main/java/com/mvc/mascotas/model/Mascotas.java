package com.mvc.mascotas.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="mascotas", uniqueConstraints = {@UniqueConstraint(columnNames = {"id"})})
public class Mascotas {
    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String description; 
    private String race;

   
}
