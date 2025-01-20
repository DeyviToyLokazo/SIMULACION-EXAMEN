package com.examenfinal.examenfinal.controllers;

import com.examenfinal.examenfinal.dto.ProductoDTO;
import com.examenfinal.examenfinal.dto.ProductoSaveDTO;
import com.examenfinal.examenfinal.model.endpoint.ProductoAPI;
import com.examenfinal.examenfinal.services.implementacion.ProductoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = ProductoAPI.BASE_URL_API_PRODUCTO)
public class ProductoController {

  @Autowired
  private ProductoService productoService;

  @GetMapping(value = ProductoAPI.GET_ALL_PRODUCTO)
  public ResponseEntity<List<ProductoDTO>> getAllProductos() {
    return new ResponseEntity<>(
      productoService.getAllProductos(),
      HttpStatus.OK
    );
  }

  @PostMapping(value = ProductoAPI.CREATE_PRODUCTO)
  public ResponseEntity<ProductoDTO> createProducto(ProductoSaveDTO producto) {
    return new ResponseEntity<>(
      productoService.createProducto(producto),
      HttpStatus.CREATED
    );
  }

  @PutMapping(value = ProductoAPI.UPDATE_PRODUCTO_BY_ID)
  public ResponseEntity<ProductoDTO> updateProducto(
    @PathVariable(value = "id") String id,
    ProductoSaveDTO producto
  ) {
    return new ResponseEntity<>(
      productoService.updateProducto(id, producto),
      HttpStatus.OK
    );
  }

  @GetMapping(value = ProductoAPI.GET_PRODUCTO_BY_ID)
  public ResponseEntity<ProductoDTO> getProductoById(@PathVariable(value = "id") String id) {
    return new ResponseEntity<>(
      productoService.getProductoById(id),
      HttpStatus.OK
    );
  }

  @DeleteMapping(value = ProductoAPI.DELETE_PRODUCTO_BY_ID)
  public ResponseEntity<Boolean> deleteProducto(@PathVariable(value = "id") String id) {
    return new ResponseEntity<>(
      productoService.deleteProducto(id),
      HttpStatus.OK
    );
  }
}
