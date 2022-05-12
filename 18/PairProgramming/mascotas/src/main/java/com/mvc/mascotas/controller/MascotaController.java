package com.mvc.mascotas.controller;

import java.util.List;

import com.mvc.mascotas.controller.service.MascotaService;
import com.mvc.mascotas.model.Mascotas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mascotas")
public class MascotaController {
    @Autowired
    private MascotaService ms;

    @GetMapping
    public String getAllMascotas(Model model){
        List<Mascotas> allMascotas =ms.getAllMascotas();
        model.addAttribute("mascotas", allMascotas);
        return "/mascotas/index";
    }
    @GetMapping("/create")
    public String showFormMascota(Model model){
        Mascotas mascota = new Mascotas();
        model.addAttribute("mascota", mascota);
        return "/mascotas/create_mascota";
    }
    @PostMapping("/create")
    public String saveMascota(@ModelAttribute("mascota") Mascotas mascota){
        ms.saveMascota(mascota);
        return "redirect:/mascotas";
    }
    @GetMapping("/update/{id}")
    public String updateMascota(@PathVariable("id") int id, Model model){
        Mascotas mascota = ms.getOneMascota(id);
        model.addAttribute("mascota", mascota);
        return "/mascotas/update_mascota";
    }
    @PostMapping("/update/{id}")
    public String updateMascota(@ModelAttribute("mascota") Mascotas mascota){
        ms.updateMascota(mascota);
        return "redirect:/mascotas";
    }
    @GetMapping("/delete/{id}")
	public String deleteMascota(@PathVariable("id") int id) {
		ms.deleteMascota(id);
		return "redirect:/mascotas";
	}
    @GetMapping("view")
    public String viewMascotas(Model model){
        List<Mascotas> allMascotas =ms.viewMascotas();
        model.addAttribute("mascotas", allMascotas);
        return "/mascotas/adoption";
    }
    @GetMapping("/adopt/{id}")
    public String adoptMascota(@PathVariable("id") int id) {
		ms.adoptMascota(id);
		return "redirect:/";
	}
        
}  
