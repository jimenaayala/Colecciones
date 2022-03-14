/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Jime
 */
public class RazasServicio {
    ArrayList<String> razas;
    
    public void crearRazas (){
        razas = new ArrayList();
        Scanner leer = new Scanner(System.in);
        int op=1;
        while (op!=0){
            System.out.println("introduzca raza de perro a agregar");
            razas.add(leer.next());
            System.out.println("Desea agregar otra raza? - escriba 0 para salir");
            op = leer.nextInt();
        }        
    }
    public void mostrarRazas(){
        System.out.println(" ");
        System.out.println("***LAS RAZAS ACTUALES SON****");        
        razas.forEach((aux) -> System.out.println(aux));
    }
    public void eliminarRazas(String razaRemove){
        Iterator<String> it = razas.iterator();
        boolean elimino = false;
        while (it.hasNext()){
            if (it.next().equals(razaRemove)){
                it.remove();   
                elimino = true;
            }
        }    
        if (elimino==false){
            System.out.println("La raza que ntenta eliminar no existe");
        }        
    }
}
