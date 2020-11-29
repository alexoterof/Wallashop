package com.alexotero.wallashop.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alexotero.wallashop.modelo.Compra;
import com.alexotero.wallashop.modelo.Usuario;

public interface CompraRepository extends JpaRepository<Compra, Long>{

	List<Compra> findByPropietario(Usuario propietario);
	
}
