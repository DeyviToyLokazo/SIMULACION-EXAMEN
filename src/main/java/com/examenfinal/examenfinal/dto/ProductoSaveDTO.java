package com.examenfinal.examenfinal.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class ProductoSaveDTO {
  private String codigo;
  private String nombre;
  private double precio;
}
