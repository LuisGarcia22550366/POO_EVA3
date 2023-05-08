/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva_8_custom;

/**
 *
 * @author invitado
 */
public class Eva_8_Custom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Person per = new Person("Luis", -18);
        per.setName("Luis Fernando");
        try {
            per.setAge(-18);
        } catch (IncorrectValueChecked e) {
            System.out.println((e.getMessage()));
        }

    }

}

class Person {

    private String name;
    private int age;

    public Person() {
        
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws IncorrectValueChecked {
       /* if (age < 0) {
            throw new IncorrectValueException();
        }
        this.age = age;
               UNCHECKED*/
        if(age < 0 )
            throw new IncorrectValueChecked();
    }

}

class IncorrectValueException extends RuntimeException {

    public IncorrectValueException() {

        super("El dato ingresado es incorrecto!!, el valor tiene que ser positivo!!!!!!!!!!!!!!!!!!!!!!!!!.");
    }

}

class IncorrectValueChecked extends Exception {

    public IncorrectValueChecked() {
        super("El dato ingresado es incorrecto!!, el valor tiene que ser positivo!!!!!!!!!!!!!!!!!!!!!!!!!.");
    }

}
