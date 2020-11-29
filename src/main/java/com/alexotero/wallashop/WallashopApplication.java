package com.alexotero.wallashop;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.alexotero.wallashop.modelo.Producto;
import com.alexotero.wallashop.modelo.Usuario;
import com.alexotero.wallashop.servicios.ProductoServicio;
import com.alexotero.wallashop.servicios.UsuarioServicio;

@SpringBootApplication
public class WallashopApplication {

	public static void main(String[] args) {
		SpringApplication.run(WallashopApplication.class, args);
	}
	
//	@Bean
//	public CommandLineRunner initData(UsuarioServicio usuarioServicio, ProductoServicio productoServicio) {
//		return args -> {
//
//			Usuario usuario = new Usuario("Alex", "Otero Ferro", "https://eu.ui-avatars.com/api/?name=Alex+Otero", "admin@example.com", "pass");
//			usuario = usuarioServicio.registrar(usuario);
//
//			Usuario usuario2 = new Usuario("Linux", "torvalds", "https://eu.ui-avatars.com/api/?name=Linux+Torvalds", "examplemail@example.com", "pass");
//			usuario2 = usuarioServicio.registrar(usuario2);
//
//			
//			List<Producto> listado = Arrays.asList(new Producto("Patinete Xiaomi", 300.0f,
//					"https://storage.googleapis.com/wallashop-imgbucket/patinete.jpg", usuario),
//					new Producto("Golf GTI 2020", 17500.0f,
//							"https://storage.googleapis.com/wallashop-imgbucket/golfgti.jpg",
//							usuario),
//					new Producto("Tofu 65", 320f, "https://storage.googleapis.com/wallashop-imgbucket/tofu65.jpg", usuario),
//					new Producto("Xbox Series X", 425.0f, "https://storage.googleapis.com/wallashop-imgbucket/xboxSX.jpg", usuario2),
//					new Producto("Trípode flexible", 10.0f, "https://storage.googleapis.com/wallashop-imgbucket/tripode.jpg", usuario2),
//					new Producto("Cepillo de dientes", 0.20f, "https://storage.googleapis.com/wallashop-imgbucket/cepillodientes.jpg", usuario2));
//			
//			listado.forEach(productoServicio::insertar);
//			
//
//		};
//	}
    
}
