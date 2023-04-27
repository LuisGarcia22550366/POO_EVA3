package eva3_4_multiplesex;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Eva3_4_MultiplesEx {

    public static void main(String[] args) {

        int x, y;
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Introduce el valor de (entero) X:");
            x = input.nextInt();
            System.out.println("Introduce el valor de (entero) Y:");
            y = input.nextInt();
            int resu = x / y;
            System.out.println("La division de " + x + "/ " + y + " "
                    + "es: " + resu);
        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir entre cero: " + e.getMessage());

        } catch (InputMismatchException e) {
            System.out.println("La captura es incorrecta: " + e.getMessage());
        }

        System.out.println("Programa terminado con exito");

    }

}
