package com.examen.MsClientes.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.examen.MsClientes.Model.ClientesModel;

@Repository
public interface IClienteRepository extends CrudRepository<ClientesModel,Integer>{
    
}
