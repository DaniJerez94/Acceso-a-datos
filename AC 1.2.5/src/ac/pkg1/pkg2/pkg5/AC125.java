/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

 // AC.1.2.5
 // Autor: Daniel Jerez González
 // Fecha: 14/09/2016
 // Descripción: realizar un programa que cree un directorio y un fichero en el directorio y que pregunte si deseas borrarlo.

package ac.pkg1.pkg2.pkg5;

/**
 *
 * @author 2dama
 */

import java.io.File;

public class AC125 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        File directorio = new File("C:\\Users\\2dama\\Desktop\\Directorio");

        
        boolean comprobar = directorio.mkdir();
        
            if(comprobar)
            {
              System.out.println("Directorio creado");
            }
            else
            {
              System.out.println("fallo al crear el directorio");
            }
            
         if(directorio.exists()){
             
             File fichero = new File("C:\\Users\\2dama\\Desktop\\Directorio\\archivo.txt");   
            
         }
         else{
             
             System.out.print("No se ha podido crear el fichero");
         }

        }

   
    
}
