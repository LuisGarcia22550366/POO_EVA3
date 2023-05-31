/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.eva3_3_try_catch;

/**
 *
 * @author eduar
 */
public class EVA3_3_TRY_CATCH {

    public static void main(String[] args) {
        int x = 5, y = 0;
        try{//BLOQUE DE CÓDIGO QUE PUEDE GENERAR UNA EXCEPCIÓN
        int resu = x/y;
        System.out.println("RESULTADO: "+resu);
        }catch(ArithmeticException e){
            System.out.println("EXCEPTION : "+e.getMessage());
        }
        System.out.println("FIN DEL PROGRAMA");
    }
}
