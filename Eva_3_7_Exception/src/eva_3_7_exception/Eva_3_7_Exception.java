package eva_3_7_exception;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Eva_3_7_Exception {

    public static void main(String[] args) {

        Prueba p = new Prueba();

        try {
            //checked : es forzoso atenderlas
            //uncheked : errores de logica, no es forzoso resolverlas
            p.capture(1);
            System.out.println("Introduce un valor: ");
            Scanner input = new Scanner(System.in);
            int value = input.nextInt();
        } catch (Exception ex) {
            //No es bueno utilizar la super clase Exception, debido a que es muy general y no podremos distinguir entre los distintos tipos de errores 
            System.out.println(ex.getMessage());
        }
        try{
            p.division(100, 0);
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        

    }

}

class Prueba {
//Exception es Checked exception
    public void capture(int val) throws Exception {
        if (val <= 0)//Voy a generar una excepción
        {
            throw new Exception(val + " :el valor tiene que ser positivo");
        }
        System.out.println("Valor: " + val);
    }
    
    public int division(int x, int y)throws ArithmeticException{
        if(y == 0)
            throw new ArithmeticException( "El valor del divisor es cero, y no es válido");
        return x / y;
    }
}
