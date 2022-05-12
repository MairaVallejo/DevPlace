package com.mvc.mascotas.controller.repository;

import java.util.List;

import com.mvc.mascotas.model.Mascotas;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MascotaRepository extends JpaRepository<Mascotas, Integer>{
    public boolean existsById(int id);
    public List<Mascotas> findAll();
    
}
