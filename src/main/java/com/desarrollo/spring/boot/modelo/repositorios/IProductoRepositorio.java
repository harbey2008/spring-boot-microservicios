package com.desarrollo.spring.boot.modelo.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.desarrollo.spring.boot.modelo.entidades.Producto;

@Repository
public interface IProductoRepositorio extends JpaRepository<Producto, Long> {

}
