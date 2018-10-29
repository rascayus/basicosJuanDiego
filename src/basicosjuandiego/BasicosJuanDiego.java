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
        // TODO code application logic here
    }
    
}
