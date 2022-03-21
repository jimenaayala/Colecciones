/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

import Servicios.ProductoServicio;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Jime
 */
public class ProductosApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner read = new Scanner(System.in);
        ProductoServicio ps = new ProductoServicio();
        int opc = 0;
        while (opc!=4) {
            System.out.println("___________MENU___________________");
            System.out.println("1 - AGREGAR UN PRODUCTO");
            System.out.println("2 - MODIFICAR UN PRODUCTO");
            System.out.println("3 - ELIMINAR UN PRODUCTO");
            System.out.println("4 - SALIR");
            System.out.println("_______SELECCIONE OPCION__________");
            opc = read.nextInt();
            switch (opc) {
                case 1:ps.sumarProducto(); 
                       break;
                case 2: ps.modificarProducto();
                        break;
                
                case 3: ps.eliminarProducto();
                        break;
                case 4:break;
            }
        }
    }
}
