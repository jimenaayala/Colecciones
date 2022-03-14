/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

import Servicios.RazasServicio;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Jime
 */
public class Razas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        RazasServicio rs = new RazasServicio();
        rs.crearRazas();
        rs.mostrarRazas();
        System.out.println("Ingrese la raza que desea eliminar");
        rs.eliminarRazas(leer.next());
        rs.mostrarRazas();            
        
        
    }
    
}
