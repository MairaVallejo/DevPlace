package com.mvc.clase19.controller.service;

import java.util.List;

import com.mvc.clase19.controller.repository.ClientsRepository;
import com.mvc.clase19.model.Clients;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientsService {

    @Autowired
    ClientsRepository cr;
    public List<Clients> getAllClients() {
        return cr.findAll();
    }
    public Clients getOneClient(Long id) {
        return cr.findById(id).get();
    }

    public boolean saveClient(Clients client) {
        if(cr.existsById(client.getId()))return false;
        cr.save(client);
        return true;
    }
    public boolean updateClient(Clients client) {
        if(!cr.existsById(client.getId())) return false;
        cr.save(client);
        return true;
    }

    public boolean deleteClient(Long id) {
        if(!cr.existsById(id))return false;
        cr.deleteById(id);
        return true;
    }
    
}
