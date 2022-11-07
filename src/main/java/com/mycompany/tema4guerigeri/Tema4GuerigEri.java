/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tema4guerigeri;

import javax.swing.JOptionPane;
import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author guerig
 */
public class Tema4GuerigEri {

    public static void main(String[] args) {
        int elegirOpcion;

        // ELEGIR OPCIÓN
        elegirOpcion = elegirOpcion();
        
        
        
        // Opcion 1- Pin 4 digitos
        for(int i = 0; i < 10; i++){
            String pin = RandomStringUtils.randomNumeric(4);
            System.out.println(pin);

        }
        
        System.out.println("------------------------");
        for(int i = 0; i < 10; i++){
            
            /* RandomStringUtils.randomAlphanumeric(número de carácteres) genera de forma aleatorio datos 
            alphanumericos dentro del rango que se especifique*/
            String password = RandomStringUtils.randomAlphanumeric(8);
            System.out.println(password);

        }
        
        System.out.println("---------- Array --------------");
        
        char[] conjuntoCaracteres = {'a', 'z', 'b', 's', '&', '*', '1'};
    
        int numero = 6;
        
        for(int i = 0; i < 10; i++){
            // RandomStringUtils.random(numero de datos, donde coger los datos), genera el número de caracteres que se le especifique 
            String password2 = RandomStringUtils.random(numero, conjuntoCaracteres);
            System.out.println(password2);

        }
        
        
    }
    
    public static int elegirOpcion(){
    int eleccion = 0;
    
    String texto = """
                   ¿Que quieres generar?
                   1. Pin
                   2. Contraseña
                   3. Secuencia de cáracteres                  
                   """;
    
    eleccion = Integer.parseInt(JOptionPane.showInputDialog(texto));
    
    System.out.println(eleccion);
    
    return eleccion;    
    }
    
    public static boolean filtrarEleccion(int elegirOpcion){
        return (elegirOpcion.equals(1) ||
                elegirOpcion.equals(2) ||
                elegirOpcion.equals(3));
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
