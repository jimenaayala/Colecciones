/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

import Entidades.Pais;
import Servicios.PaisServicio;
import java.util.Scanner;

/**
 *
 * @author Jime
 */
public class PaisApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        PaisServicio ps = new PaisServicio();
        String op = "C";
        
        while (!op.equalsIgnoreCase("S")){
            Pais p = ps.crearPais();
            System.out.println("________________S_____________ para salir");
            op=read.next();            
        }
        ps.mostrarPaises();
        
        System.out.println("Ingrese el pais a eliminar.");
        ps.eliminarPais(read.next());
        System.out.println("");
        System.out.println("LISTA CON PAIS ELIMINADO");
        ps.mostrarPaises();
        
        
        
    }
    
}
