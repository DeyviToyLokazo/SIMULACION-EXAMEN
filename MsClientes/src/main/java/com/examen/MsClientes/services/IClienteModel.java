package com.examen.MsClientes.services;

import java.util.List;

import com.examen.MsClientes.Model.ClientesModel;

public interface IClienteModel {
    public List<ClientesModel> findAll();
    public ClientesModel findById(Integer id);
    public ClientesModel add(ClientesModel model);
    public ClientesModel update(ClientesModel model);
    public Boolean delete(Integer id);
}
