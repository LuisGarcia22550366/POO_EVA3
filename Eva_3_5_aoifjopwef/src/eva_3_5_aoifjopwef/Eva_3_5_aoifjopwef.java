/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva_3_5_aoifjopwef;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class Eva_3_5_aoifjopwef {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int x;

        do {
            try {
                Scanner input = new Scanner(System.in);
                System.out.println("Introduce el valor de (entero) X:");
                x = input.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Los valores ingresados no son correctos!!!!!!!!!!!!!!!!!!!!!!!!!!!!!, vuelve a intentarlo");
            }

        } while (true);
        System.out.println("Valor de X = " + x);

    }

}
