package com.mvc.mascotas.controller.service;

import java.util.List;
import com.mvc.mascotas.controller.repository.MascotaRepository;
import com.mvc.mascotas.model.Mascotas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MascotaService {
    @Autowired 
    private MascotaRepository mr;

    public List<Mascotas> getAllMascotas(){
        return mr.findAll();
    }
    public Mascotas getOneMascota(int id){
        return mr.findById(id).get();
    }
    public boolean saveMascota(Mascotas mascota){
        if(mr.existsById(mascota.getId())) return false;
        mr.save(mascota);
        return true;
    }
    public boolean updateMascota(Mascotas mascota) {
		if(!mr.existsById(mascota.getId())) return false;
		mr.save(mascota);
		return true;
	}
	
	public boolean deleteMascota(int id) {
		if(!mr.existsById(id)) return false;
		mr.deleteById(id);
		return true;
	}
    public boolean adoptMascota(int id) {
        if(!mr.existsById(id)) return false;
		mr.deleteById(id);
		return true;
    }
    public List<Mascotas> viewMascotas() {
        return mr.findAll();
    }
    
}
