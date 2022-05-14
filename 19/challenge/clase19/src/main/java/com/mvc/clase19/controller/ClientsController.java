package com.mvc.clase19.controller;

import java.util.List;

import com.mvc.clase19.controller.service.ClientsService;
import com.mvc.clase19.model.Clients;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/clients")
public class ClientsController {

    @Autowired
    ClientsService cs;
    // metodo para mostrar todos los clientes 
    @GetMapping
    public String getAllClients(Model model){
        List<Clients> allClients= cs.getAllClients();
        model.addAttribute("clients", allClients);
        return "/index";
    }
    //metodo para crear el cliente 
    @GetMapping("/create")
    public String showFormClient(Model model){
        Clients client= new Clients();
        model.addAttribute("client", client);
        return "/create_client";
    }
    //metodo para guardar el cliente creado 
    @PostMapping("/create")
    public String saveClient(@ModelAttribute("client") Clients client){
        cs.saveClient(client);
        return "redirect:/clients";
    }
    //Metodo para modificar el cliente pero por id
    //se busca el cliente por id 
    @GetMapping("/update/{id}")
    public String updateClient(@PathVariable("id") Long id, Model model){
        Clients client= cs.getOneClient(id);
        model.addAttribute("client", client);
        return "/update_client";
    }
    //se modifica ese cliente 
    @PostMapping("update/{id}")
    public String updateClient(@ModelAttribute("client") Clients client){
        cs.updateClient(client);
        return "redirect:/clients";
    }
    //metodo para eliminar el cliente por id 
    @GetMapping("delete/{id}")
    public String deleteClient(@PathVariable("id") Long id){
        cs.deleteClient(id);
        return  "redirect:/clients";
    }
}
