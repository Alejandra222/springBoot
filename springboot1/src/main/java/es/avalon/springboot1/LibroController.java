package es.avalon.springboot1;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import es.avalon.jpa.negocio.Libro;

@Controller
@RequestMapping("/libros")
public class LibroController {

	@RequestMapping("/hola")
	public String buscarLibro(Model modelo) {
		List<Libro> libros =new ArrayList<Libro>();
		Libro l1 = new Libro("java","juan", 200);
		libros.add(l1);
		Libro l2 = new Libro("net","marta", 100);
		libros.add(l2);
		Libro l3 = new Libro("angular","luis", 300);
		libros.add(l3);
		modelo.addAttribute("listaLibros",libros);
		//return new Libro("java","juan", 200);
		return "hola";
	}
}
