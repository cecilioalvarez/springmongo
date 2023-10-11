package com.mongodb.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mongodb.demo.models.Cliente;
import com.mongodb.demo.repositorios.ClienteRepository;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
    
@Autowired
private ClienteRepository repoCliente;



@GetMapping
public List<Cliente> buscarTodos() {

   
   return repoCliente.findAll();

}

@PostMapping
public void  insertar( @RequestBody Cliente cliente) {

    repoCliente.save(cliente);

}

}
