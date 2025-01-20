package com.examen.MsClientes.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen.MsClientes.Model.ClientesModel;
import com.examen.MsClientes.repository.IClienteRepository;

@Service
public class ClienteService implements IClienteModel{
    @Autowired
    IClienteRepository repository;

    @Override
    public List<ClientesModel> findAll() {
        return (List<ClientesModel>)repository.findAll();
    }

    @Override
    public ClientesModel findById(Integer id) {
        return (ClientesModel)repository.findById(id).get();
    }

    @Override
    public ClientesModel add(ClientesModel model) {
        return repository.save(model);
    }

    @Override
    public ClientesModel update(ClientesModel model) {
        return repository.save(model);
    }

    @Override
    public Boolean delete(Integer id) {
        repository.deleteById(id);
        return true;
    }
    
}
