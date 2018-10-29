/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicosjuandiego;

/**
 *
 * @author lunero
 */
public class BasicosJuanDiego {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        cadenas();// TODO code application logic here
    }
     public static void cadenas() {

        //Estos son los tipos básicos de cadenas
        String cadena=new String();
        char caracter;
        

        //Ejemplos de asignación de valores a las variables de cadenas
        caracter = 'J';
        cadena = "Juan Diego";

        //Mostrar en pantalla el contendido de las variables de tipos básicos.
        System.out.println("Tipo char");
        System.out.println(caracter);
        System.out.println("Clase String");
        System.out.println(cadena);
    }
}
