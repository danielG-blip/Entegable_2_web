package com.tienda.luking_store.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.tienda.luking_store.model.Producto;

public interface productoRepository extends JpaRepository<Producto, Long>{
    
}
