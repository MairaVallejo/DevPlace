package com.mvc.clase19.model;

import javax.persistence.*;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name= "clients")
public class Clients{
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id; 
    private Long dni;
    private String name;
    private String email;
    private String address;

}
