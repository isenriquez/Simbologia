/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simbologia;

import java.util.Scanner;

/**
 *
 * @author Israel Enriquez
 */
public class Simbologia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner objeto=new Scanner(System.in);//new rerva espacio de memoria
        System.out.println("UNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE");
        System.out.println("MOODELAMIENTO DE CLASES Y OBJETOS");
        System.out.println("Simbologia");
        System.out.println("Ingrese el Objeto");
        String obj1=objeto.nextLine();
        System.out.println("Ingrese la clase deobjeto:");
        String claseobj1=objeto.nextLine();
        System.out.println("Ingrese los atributos:");
        String atrib1=objeto.nextLine();
        String atrib2=objeto.nextLine();
        String atrib3=objeto.nextLine();
        System.out.println("Ingrese los servicios :");
        String serv1=objeto.nextLine();
        String serv2=objeto.nextLine();
        String serv3=objeto.nextLine();
        System.out.println("Gracias por utilizar el programa");
    }
}
