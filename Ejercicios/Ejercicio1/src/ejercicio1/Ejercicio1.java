/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author 2dama
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        JFrame ventana = new JFrame();
        ventana.setVisible(true);
        ventana.setSize(200,300);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Cuando se cierre
        //la ventana se cerrará el programa
        ventana.setTitle("Ejercicio1");
        ventana.getContentPane().setLayout(new BorderLayout(5,10)); //5 y 10 es el padding de los componentes
        
        //Creamos las etiquetas
        JLabel etiqueta = new JLabel("Etiqueta1");
        JLabel etiqueta2 = new JLabel("Etiqueta2");
        JTextField texto1 = new JTextField();
        JTextField texto2 = new JTextField();
        
        //Le cambiamos las dimensiones a los textfield
        texto1.setPreferredSize( new Dimension( 100, 35 ) );
        texto2.setPreferredSize( new Dimension( 100, 35 ) );

        JButton boton = new JButton("Aceptar");
        
        //Añadimos los componentes a la ventana
        
        ventana.getContentPane().add(texto1,BorderLayout.NORTH);
        ventana.getContentPane().add(texto2,BorderLayout.SOUTH);
        ventana.getContentPane().add(etiqueta,BorderLayout.WEST);
        ventana.getContentPane().add(etiqueta2,BorderLayout.EAST);
        ventana.getContentPane().add(boton,BorderLayout.CENTER);
        
        ventana.pack(); //Empaquetamos la ventana
        
    }
    
}
