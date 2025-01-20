package com.examenfinal.examenfinal.services.implementacion;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examenfinal.examenfinal.dto.ProductoDTO;
import com.examenfinal.examenfinal.dto.ProductoSaveDTO;
import com.examenfinal.examenfinal.model.Producto;
import com.examenfinal.examenfinal.repository.ProductoRepository;
import com.examenfinal.examenfinal.services.IProductoService;

@Service
public class ProductoService  implements IProductoService {

  @Autowired
  private ProductoRepository productoRepository;
  
  @Override
  public List<ProductoDTO> getAllProductos() {
    return productoRepository.findAll().stream().map(p -> new ProductoDTO(p.getId(), p.getCodigo(), p.getNombre(), p.getPrecio())).toList();    
  }

  @Override
  public ProductoDTO getProductoById(String id) {
    ProductoDTO producto = productoRepository.findById(id).map(p -> new ProductoDTO(p.getId(), p.getCodigo(), p.getNombre(), p.getPrecio())).orElse(null);
    return producto;
  }

  @Override
  public ProductoDTO createProducto(ProductoSaveDTO producto) {
      ProductoSaveDTO productoSave = new ProductoSaveDTO(producto.getCodigo(), producto.getNombre(), producto.getPrecio());
      Producto productoEntity = new Producto(productoSave.getCodigo(), productoSave.getNombre(), productoSave.getPrecio());
      return new ProductoDTO(productoRepository.save(productoEntity).getId(), productoSave.getCodigo(), productoSave.getNombre(), productoSave.getPrecio());
  }

  @Override
  public ProductoDTO updateProducto(String id, ProductoSaveDTO producto) {
    
    if(productoRepository.existsById(id)) {
      return new ProductoDTO(productoRepository.save(new Producto(id, producto.getCodigo(), producto.getNombre(), producto.getPrecio())).getId(), producto.getCodigo(), producto.getNombre(), producto.getPrecio());
    }
    return null;
  }

  @Override
  public boolean deleteProducto(String id) {
  
    if(productoRepository.existsById(id)) {
      productoRepository.deleteById(id);
      return true;
    }
    return false;
  }
  
}
