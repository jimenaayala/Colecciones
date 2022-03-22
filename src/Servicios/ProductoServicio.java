/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Jime
 */
public class ProductoServicio {
    Map <String,Float> productos = new HashMap<>();

    
    public void sumarProducto (){
    Scanner read = new Scanner(System.in);
        System.out.println("Introduzca nomnre del producto y valor");
        productos.put(read.nextLine(), read.nextFloat());
        mostrarProductos();
    }
    public void eliminarProducto(){
    Scanner read = new Scanner(System.in);
        String prodEliminar;
        System.out.println("Ingrese el nombre del producto que desea eliminar:");        
        prodEliminar = read.nextLine();
        productos.remove(prodEliminar);
        mostrarProductos();
    } 

    public void modificarProducto(){
        Scanner read = new Scanner(System.in);
        String prodModificar;
        System.out.println("Ingrese el nombre del producto que desea modificar:");        
        prodModificar = read.nextLine();
        productos.entrySet().forEach((entry) -> {
            String key = entry.getKey();
            Float value = entry.getValue();
            if (prodModificar.equalsIgnoreCase(key)) {
                System.out.println("Ingrese producto y valor");
                productos.put(key, (float) (read.nextDouble()));                               
            }
            mostrarProductos();
        });
    
    }
    public void mostrarProductos(){
        System.out.println("");
        System.out.println("*****LISTA DE PRODUCTOS********");
        productos.entrySet().forEach((entry) -> {
            System.out.print("*");
            System.out.printf("Producto : %s - Valor $: %s %n", entry.getKey(), entry.getValue());
            
        });
        System.out.println("********************************");
    }
}
