/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Alumno;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Jime
 */
public class AlumnoServicio {

    Scanner leer = new Scanner(System.in);

    public Alumno crearAlumno() {
        Alumno a = new Alumno();
        System.out.println("Ingrese nombre del alumno: ");
        a.setNombre(leer.next());
        cargarNotas(a);
        return a;
    }

    public void cargarNotas(Alumno a) {
        ArrayList<Integer> n = new ArrayList();
        System.out.println("Ingrese las tres notas:");
        n.add(leer.nextInt());
        n.add(leer.nextInt());
        n.add(leer.nextInt());
        a.setNotas(n);
    }

    public void mostrarAlumnos(ArrayList<Alumno> alumnos) {
        alumnos.forEach((aux) -> System.out.println(aux));
    }

}
