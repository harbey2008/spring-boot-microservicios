package com.desarrollo.spring.boot.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.desarrollo.spring.boot.modelo.entidades.Producto;
import com.desarrollo.spring.boot.modelo.servicios.IProductoServicio;

@RestController
public class ProductoControlador {
	
	@Autowired
	private IProductoServicio productoServicio;
	
	@GetMapping(value="/productos", produces = "application/json")
	public List<Producto> obtenerProductos() {
		//System.out.println(productoServicio.obtenerTodosProductos());
		
		return (productoServicio.obtenerTodosProductos());
	}
	
	@GetMapping(value="/productos/{id}")
	public Producto obtenerProducto(@PathVariable Long id) {
		return productoServicio.obtenerProducto(id);
	}

}
