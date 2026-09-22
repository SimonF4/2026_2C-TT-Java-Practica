package com.talentotech.Clase03;

// (Necesario importar esta libreria para usar el ingreso por teclado.)
import java.util.Scanner;

public class Main {
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        // creacion de objetos
        /*
        Producto p1 = new Producto("Coca Cola", 1.5, 100);
     	Producto p2 = new Producto("Pepsi", 1.4, 80);
     	
     	// Ejemplo si le queres asignar un valor al id
     	// Producto p3 = new Producto(1L, "Pepsi", 1.4, 80);
     	
     	Producto p4 = new Producto();
        
     	// mostrar los datos de los productos
        // System.out.println( "Producto 1: " + p1.getPrecio() + " - " +  p1.getStock() );
        	// Resultado: "Producto 1: 1.5 - 1"
        // System.out.println( "Producto 2: " + p2.getPrecio() + " - " +  p2.getStock() );
        	// Resultado: "Producto 2: 1.4 - 1"
    	*/
        
        
        // System.out.println(p1.getNombre()); 	// Resultado: "Coca Cola"
        // System.out.println(p3.getId());

        // modificar los datos de los productos
        // p1.setPrecio(1.7);
        // System.out.println(p1.getPrecio()); 	// 	Resultado: "1.7"

        // System.out.println(p4.getPrecio()); 	//  Resultado: "0.0"
        // System.out.println(p4.getNombre()); 	//  Resultado: "Producto Generico"
        // System.out.println(p4.getStock()); 	//  Resultado: "1"
        // System.out.println(p4.getId()); 		// 	Resultado: "3"

     	/*
        System.out.println("----------------------");

        p4.setNombre("Fanta");
        p4.setPrecio(1.3);
        System.out.println(p4.getNombre());	// Resultado: "Fanta"
        System.out.println(p4.getPrecio());	// Resultado: "1.3"

        System.out.println("----------------------");
        p2.mostrarDatos();	// Resultado: ID: 2 \n Nombre: Pepsi \n Precio: 1.4 \n Stock: 1
        //p3.mostrarDatos();

        Producto p5 = new Producto();
        System.out.println(p5.getId());	// Resultado: "4"
        System.out.println(p4.getId());	// Resultado: "3" 
        p4.mostrarDatos(); 	// Resultado: "ID: 3 \n Nombre: Fanta \n Precio: 1.3 \n Stock: 1"
        p5.mostrarDatos();	// Resultado: "ID: 4 \n Nombre: Producto Generico \n Precio: 0.0 \n Stock: 1"
     	*/
        
        System.out.println("----------------------");

        Scanner ingreso = new Scanner(System.in);

        // entrada de datos por consola
        System.out.println("Nombre : ");
        String nombre = ingreso.nextLine();

        System.out.println("Precio: ");
        double precio = ingreso.nextDouble();
        ingreso.nextLine(); // limpiar el buffer despues de nexttDouble()
        ingreso.close(); // Sino tira warning de que no se cerro el scanner.

        Producto p1 = new Producto (nombre,precio);

        p1.mostrarDatos();
        /*
        // ******** TEST: ********
        Nombre : 
        Test1
        Precio: 
        1567
        ID: 1
        Nombre: Test1
        Precio: 1567.0
        Stock: 1
        */
    }
}
