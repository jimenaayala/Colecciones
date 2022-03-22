/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Pais;
import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Jime
 */
public class PaisServicio {
    
    TreeSet<Pais> paises;

    public PaisServicio() {
        this.paises = new TreeSet();
    }
            
    public Pais crearPais(){
        Scanner read = new Scanner(System.in);
        Pais p = new Pais();
        System.out.println("Ingrese nombre del pais:");
        p.setNombre(read.nextLine());
        sumarPais(p);
        return p;
    }
    public void sumarPais(Pais pNuevo){
        this.paises.add(pNuevo);
    }
    public void mostrarPaises(){
        paises.forEach((pAux) -> {
            System.out.println(pAux);
        });
    }
    public void eliminarPais (String p){
        for (Pais pAux: paises){
            if (pAux.getNombre().equalsIgnoreCase(p)){
                paises.remove(pAux);
            }
        }
    }

    
}
