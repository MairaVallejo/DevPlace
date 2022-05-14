package com.mvc.clase19.controller.repository;

import java.util.List;

import com.mvc.clase19.model.Clients;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientsRepository extends JpaRepository<Clients, Long> {

    List<Clients> findAll();
    boolean existsById(Long id);
}
