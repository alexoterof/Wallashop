package com.alexotero.wallashop.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alexotero.wallashop.modelo.Compra;
import com.alexotero.wallashop.modelo.Producto;
import com.alexotero.wallashop.modelo.Usuario;

public interface ProductoRepository extends JpaRepository<Producto, Long>{

	List<Producto> findByPropietario(Usuario propietario);
	
	List<Producto> findByCompra(Compra compra);
	
	List<Producto> findByCompraIsNull();
	
	List<Producto> findByNombreContainsIgnoreCaseAndCompraIsNull(String nombre);
	
	List<Producto> findByNombreContainsIgnoreCaseAndPropietario(String nombre, Usuario propietario);
	
}

