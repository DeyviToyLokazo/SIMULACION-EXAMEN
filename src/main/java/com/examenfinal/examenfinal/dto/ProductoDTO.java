package com.examenfinal.examenfinal.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductoDTO {

  private String id;
  private String codigo;
  private String nombre;
  private double precio;
}
