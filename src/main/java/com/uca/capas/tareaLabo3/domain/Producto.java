package com.uca.capas.tareaLabo3.domain;

public class Producto {
	private Integer id; 
	private Integer cantidad;
	private String nombre;
	public Producto(Integer id, Integer cantidad, String nombre) {
		super();
		this.id = id;
		this.cantidad = cantidad;
		this.nombre = nombre;
	}
	public Producto() {
		super();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	

}
