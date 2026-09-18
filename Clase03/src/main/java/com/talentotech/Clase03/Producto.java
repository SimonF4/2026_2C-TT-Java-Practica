package com.talentotech.Clase03;

public class Producto {

	// Atributos
	private Long id;
	private String nombre;
	private double precio;
	private int stock;
	
	public Producto (String nombre, double precio, int stock) {
		this.nombre = nombre;
		this.precio = precio;
		this.stock = stock;
	}

	public Producto(long id, String nombre, double precio, int stock) {
		this.id = id;
		//this (nombre, precio, stock);
		this.nombre = nombre;
		this.precio = precio;
		this.stock = stock;
	}

	public Producto() {
		// Constructor default.
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
}
