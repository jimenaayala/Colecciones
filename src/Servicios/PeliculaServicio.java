/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Pelicula;
import Utilidades.Comparadores;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Jime
 */
public class PeliculaServicio {
    ArrayList<Pelicula> listaPeliculas;

    public PeliculaServicio() {
        this.listaPeliculas = new ArrayList();
    }
    public Pelicula crearPeli(){
        Scanner leer = new Scanner (System.in);
        Pelicula peli = new Pelicula();
        
        System.out.println("Ingrese Titulo, directr y duración: ");
        peli.setTitulo(leer.nextLine());
        peli.setDirector(leer.nextLine());
        peli.setDuracion(leer.nextInt());
        enlistarPeli(peli);
        return peli;
    }
    public void enlistarPeli(Pelicula newPeli){
        listaPeliculas.add(newPeli);
    }
    public void mostrarPelis(int filtro){
        //filtro = muestra todas las peliculas, filtro 1 muestra las con duracion mayor a 1 hora
        listaPeliculas.forEach((peli) -> {
            if (filtro ==0){
                System.out.println(peli.toString());
            } else{
                if (peli.getDuracion()>1){
                    System.out.println(peli.toString());
                }
            }
        });
    }
    public void ordenarPelis(int tipoOrden){
        switch (tipoOrden){
            case 1: Collections.sort(listaPeliculas, Comparadores.ordenarTituloDesc);
                    break;
            case 2: Collections.sort(listaPeliculas, Comparadores.ordenarDirectorDesc);
                    break;
            case 3: Collections.sort(listaPeliculas, Comparadores.ordenarDuracionDesc);
        }
        
        
        
    }
}
