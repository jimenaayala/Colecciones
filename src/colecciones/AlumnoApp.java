/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

import Entidades.Alumno;
import Servicios.AlumnoServicio;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Jime
 */
public class AlumnoApp {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        ArrayList<Alumno> alumnos = new ArrayList();
        AlumnoServicio as = new AlumnoServicio();
        String op = "C";
        while (!op.equalsIgnoreCase("s")){
            alumnos.add(as.crearAlumno());
            System.out.println("presione S para salir");
            op = leer.next();
        }
        as.mostrarAlumnos(alumnos);
        System.out.println("Sobre que usuario quiere calcular la nota final");
        
    }
    
}
