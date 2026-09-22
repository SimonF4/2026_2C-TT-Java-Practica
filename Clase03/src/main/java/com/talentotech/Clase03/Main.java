package com.talentotech.Clase03;

/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        // creacion de objetos
        Producto p1 = new Producto("Coca Cola", 1.5, 100);
     	Producto p2 = new Producto("Pepsi", 1.4, 80);
     	
     	Producto p3 = new Producto(1L, "Pepsi", 1.4, 80);
     	
     	Producto p4 = new Producto();
        
     	// mostrar los datos de los productos
        System.out.println( "Producto 1: " + p1.getPrecio() + " - " +  p1.getStock() );
        System.out.println( "Producto 2: " + p2.getPrecio() + " - " +  p2.getStock() );
    
        
        
        
        
        
    }
}
