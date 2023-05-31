/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.eva3_1_unchecked_exceptions;

import java.util.Scanner;

/**
 *
 * @author eduar
 */
public class EVA3_1_UNCHECKED_EXCEPTIONS {

    public static void main(String[] args) {
        //SON TODAS DE RUNTIMEEXCEPTION
        
        //ARITMETIC EXCEPTIONS
        //DIVISIÓN ENTRE CERO
        System.out.println("INICIANDO EL PROGRAMA");
        int x =5, y =0;
        System.out.println("INICIALIZANDO LAS VARIABLES");
        int resu = x / y;
        System.out.println("CALCULANDO LA DIVISIÓN");
        System.out.println("DIVISIÓN: "+resu);
        
        //InputMismatchException
        Scanner input = new Scanner(System.in);
        System.out.println("INTRODUCE UN NÚMERO");
        int nume = input.nextInt();
        System.out.println("TU NÚMERO ES : "+nume);
        
        //INDEXOUTOFBOUNDS EXCEPTION
        int[] arreglo = new int[5]; //0- (N-1)
        arreglo[0] = 100;
        arreglo[1] = 200;
        arreglo[2] = 300;
        arreglo[3] = 400;
        arreglo[4] = 500;
        arreglo[5] = 600; //ERROR. EL 5 NO ES UN APOSICIÓN VÁLIDA.
        
        //NULLPOINTER EXCEPTION
        Prueba objPrueba = null;
        System.out.println("VALOR DE X = "+objPrueba.x);
    }
}
class Prueba{
    public int x = 100;
}
