/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.eva3_2_exception_propagation;

/**
 *
 * @author eduar
 */
public class EVA3_2_EXCEPTION_PROPAGATION {

    public static void main(String[] args) {
        System.out.println("INICA MAIN");
         A();
        System.out.println("TERMINA MAIN");
    }
    public static void A(){
    
        System.out.println("INICA A");
         B();
        System.out.println("TERMINA A");
    }
    public static void B(){
        
        System.out.println("INICA B");
        C();
        System.out.println("TERMINA B");
    }
    public static void C(){
       
        System.out.println("INICA C");
        int x = 5, y = 0;
        int resu = x/y;
        System.out.println("RESULTADO = "+resu);
        System.out.println("TERMINA C");
    }
}
