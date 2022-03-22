/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

import Entidades.Pelicula;
import Servicios.PeliculaServicio;
import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;
import java.util.Scanner;

/**
 *
 * @author Jime
 */
public class PeliculaApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        Pelicula peli = new Pelicula();
        PeliculaServicio ps = new PeliculaServicio ();
        String opc = "c";
        while (!opc.equalsIgnoreCase("s")){
            peli = ps.crearPeli();
            System.out.println("la peli cargada es :" + peli.toString());
            System.out.println("presione S para dejar de cargar peliculas u otra letra para continuar");
            opc=leer.next();
        }
        System.out.println("****LISTADO DE TODAS LAS PELIS*******");
        ps.mostrarPelis(0);
        
        System.out.println("");
        System.out.println("****Y LAS QUE DURAN MAS DE UNA HORA SON*******");
        ps.mostrarPelis(1);
        
        System.out.println("");
        System.out.println("**********PELIS ORDENADAS POR TITULO**************");
        ps.ordenarPelis(1);
        ps.mostrarPelis(0);    
        
        System.out.println("");
        System.out.println("**********PELIS ORDENADAS POR DIRECTOR**************");
        ps.ordenarPelis(2);
        ps.mostrarPelis(0);        
        
        System.out.println("");
        System.out.println("**********PELIS ORDENADAS POR DURACION**************");
        ps.ordenarPelis(3);
        ps.mostrarPelis(0);    
    }
    
}
