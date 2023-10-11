package com.mongodb.demo.repositorios;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mongodb.demo.models.Cliente;

// este interface hereda de un interface generico
//que contiene todas las operaciones basicas
//implementar la clase pero no hace falta porque el interface
//ya lleva todo la implementacion por defecto
public interface ClienteRepository  extends MongoRepository<Cliente,Integer>{
    
}
