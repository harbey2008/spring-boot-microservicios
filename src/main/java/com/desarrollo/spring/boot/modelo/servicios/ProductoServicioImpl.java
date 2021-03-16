package com.desarrollo.spring.boot.modelo.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.desarrollo.spring.boot.modelo.entidades.Producto;
import com.desarrollo.spring.boot.modelo.repositorios.IProductoRepositorio;

@Service
public class ProductoServicioImpl implements IProductoServicio {

	@Autowired
	private IProductoRepositorio productoRepositorio;
	
	@Override
	@Transactional(readOnly = true)
	public List<Producto> obtenerTodosProductos() {
		return productoRepositorio.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Producto obtenerProducto(Long id) {
		return productoRepositorio.findById(id).orElse(null);
	}

}
