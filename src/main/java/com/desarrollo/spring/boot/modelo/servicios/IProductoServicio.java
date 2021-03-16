package com.desarrollo.spring.boot.modelo.servicios;

import java.util.List;

import com.desarrollo.spring.boot.modelo.entidades.Producto;

public interface IProductoServicio {
	
	List<Producto> obtenerTodosProductos(); 
	Producto obtenerProducto(Long id); 

}
