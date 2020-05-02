package com.uca.capas.tareaLabo3.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.uca.capas.tareaLabo3.domain.Producto;

@Controller
public class MainController {
	private List<Producto> productos = new ArrayList<Producto>();
	
	@GetMapping("/compraProductos")
	public ModelAndView compraProducto() {
		ModelAndView model = new ModelAndView();
		
		productos.add(new Producto(0,20,"Pan"));
		productos.add(new Producto(1,30,"Manzana"));
		productos.add(new Producto(2,40,"Cereal"));
		productos.add(new Producto(3,50,"Carne"));
		productos.add(new Producto(4,60,"Pollo"));
		
		model.addObject("producto", new Producto());
		model.addObject("listaDeProductos",this.productos);
		model.setViewName("/productos");
		return model;
	}
	
	@ResponseBody
	@GetMapping("/lista")
	public List<Producto> productos(){
		return this.productos;
	}
	
	@PostMapping("/validar")
	public ModelAndView validar(Producto producto) {
		ModelAndView model = new ModelAndView();
		model.addObject("producto",productos.get(producto.getId()).getNombre());
		if(producto.getCantidad()<=productos.get(producto.getId()).getCantidad()) {
			model.setViewName("/compra");
		}else {
			model.setViewName("/error");
		}
		
		return model;
	}
}
