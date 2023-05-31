/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.eva3_4_multiples_excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author eduar
 */
public class EVA3_4_MULTIPLES_EXCEPCIONES {

    public static void main(String[] args) {
        int x,y;
        Scanner input = new Scanner (System.in);
        
        try{
        System.out.println("INTRODUZCA EL VALOR (ENTERO) DE X :");
        x = input.nextInt();
        System.out.println("INTRODUZCA EL VALOR (ENTERO) DE y :");
        y = input.nextInt();
        int resu = x/y;
        System.out.println("LA DIVISIÓN DE " + x + "/" + y +  " es " +resu);
        } catch(InputMismatchException e){
            System.out.println("LA CAPTURA ES INCORRECTA: "+e.getMessage());
        } catch(ArithmeticException e){
            System.out.println("NO SE PUEDE DIVIDIR ENTRE CERO: "+e.getMessage());
            
        }
        
        System.out.println("PROGRAMA TERMINADO CON ÉXITO");
    }
}
