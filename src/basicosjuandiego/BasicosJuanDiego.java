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

    numericos();
    cadenas();
    logicos();// TODO code application logic here
    }
     public static void numericos() {

        //Estos son los tipos básicos
        byte elMasPeque;
        short chiquitin;
        int entero;
        long duplicaEntero;
        float grande;
        double doble;

        //Ejemplos de asignación de valores a las variables de tipos básicos
        elMasPeque = 127 ;
        chiquitin = -32678;
        duplicaEntero = -2000;
        grande = 100000;
        entero = 10;
        doble = 5.6;

        //Mostrar en pantalla el contendido de las variables de tipos básicos.
        System.out.println("Valor Byte");
        System.out.println(elMasPeque);
        System.out.println("Valor short");
        System.out.println(chiquitin);
        System.out.println("Valor entero");
        System.out.println(entero);
        System.out.println("Valor long");
        System.out.println(duplicaEntero);
        System.out.println("Valor float");
        System.out.println(grande);
        System.out.println("Valor doble");
        System.out.println(doble);
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
    public static void logicos() {

        //Estos son los tipos básicos de cadenas
        boolean certeza;
               

        //Ejemplos de asignación de valores a las variables de cadenas
        certeza = false;
        
        //Mostrar en pantalla el contendido de las variables de tipos básicos.
        
        if (certeza) {
        System.out.println("La certeza es auténtica.");
    }
        else { 
        System.out.println("La certeza no existe.");
        }
        certeza = true;
        if (certeza) {
        System.out.println("O tal vez si.");
    }
        else { 
        System.out.println("La certeza no existe.");
    }
    }
}
