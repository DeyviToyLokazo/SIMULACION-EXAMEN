package com.examen.MsClientes.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="clientes")
public class ClientesModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@Column(name="id_cliente")
    public Integer idCliente;

    @Column(name= "dni")
    public String dni;

    @Column(name= "nombre")
    public String nombre;

    @Column(name= "apellido")
    public String apellido;

    @Column(name= "edad")
    public Integer edad;

    @Column(name= "sexo")
    public String sexo;
}
