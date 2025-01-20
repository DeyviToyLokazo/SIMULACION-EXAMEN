package com.examenfinal.examenfinal.services;

import com.examenfinal.examenfinal.dto.ProductoDTO;
import com.examenfinal.examenfinal.dto.ProductoSaveDTO;
import java.util.List;

public interface IProductoService {
  public List<ProductoDTO> getAllProductos();

  public ProductoDTO getProductoById(String id);

  public ProductoDTO createProducto(ProductoSaveDTO producto);

  public ProductoDTO updateProducto(String id, ProductoSaveDTO producto);

  public boolean deleteProducto(String id);
}
