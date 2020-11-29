package com.alexotero.wallashop.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alexotero.wallashop.modelo.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	
	Usuario findFirstByEmail(String email);

}
