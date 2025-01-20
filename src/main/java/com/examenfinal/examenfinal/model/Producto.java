package com.examenfinal.examenfinal.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "producto")
public class Producto {

  @Id
  private String id;

  private String codigo;
  private String nombre;
  private double precio;
  
  public Producto(String codigo, String nombre, double precio) {
    this.codigo = codigo;
    this.nombre = nombre;
    this.precio = precio;
  }
  
}
