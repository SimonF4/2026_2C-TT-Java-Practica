package com.talentotech.Clase03;

public class Producto {

	// contador estatico:
	// Funciona a nivel de clase, no depende de una instancia creada.
	private static Long contadorId = 0L; 
	
	// Atributos
	private Long id;
	private String nombre;
	private double precio; // No uso el wrapper en mi caso.
	private int stock;
	
	public Producto() {
		// Constructor default.
		// Le agregamos valores default/genericos/de inicio.
		this("Producto Generico", 0.0, 0);
	}
	
	public Producto (String nombre, double precio) {
		// Yo en mi caso aprovecho el otro constructor (con "this") para nada mas no repetir codigo.
		this(nombre, precio, 1);
	}

	public Producto(String nombre, double precio, int stock) {
		//this (nombre, precio, stock);
		this.id = ++contadorId;
		this.nombre = nombre;
		this.precio = precio;
		
		if (this.stock == 0) {
			this.stock = 1;
		}else {
			this.stock = stock;			
		}
		// TODO Mejorar: Validaciones, extraerlas a metodos y validar los otros atributos.
	}

	// GETTERS Y SETTERS
	public Long getId() {
        return id;
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
	
	// OTROS METODOS:
	// metodos propios de la clase
	public void mostrarDatos() {
		System.out.println("ID: " 		+ id);
		System.out.println("Nombre: " 	+ nombre);
		System.out.println("Precio: " 	+ precio);
        System.out.println("Stock: " 	+ stock);
	}
}
