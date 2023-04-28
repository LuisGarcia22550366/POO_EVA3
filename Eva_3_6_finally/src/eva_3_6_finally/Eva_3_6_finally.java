package eva_3_6_finally;

public class Eva_3_6_finally {

    public static void main(String[] args) {
        try {
            int x = 9, y = 1;
            int resu = x / y;
            System.out.println("Resultado: " + resu);

        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir entre cero");
        }finally{//Obliga a la ejecución de esta sección de código
            //Es opcional eoprtjs woie jntw
            System.out.println("SIEMPRE SE VA A EJECUTAR ESTO SHESH!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        }

        System.out.println("Fin");
    }

}
