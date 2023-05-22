/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva_3_14_append_obj;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author invitado
 */
public class Eva_3_14_APPEND_OBJ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            saveObjects(new Person("Luis", "Garcia", 18));
            saveObjects(new Person("aLuis", "b", 11));
            saveObjects(new Person("asas", "srgw", 12));
            saveObjects(new Person("Luis", "Garcia", 10));
            saveObjects(new Person("Fernando", "Garcia", 47));
            //Ahora a leer
            readObjects();
        } catch (IOException ex) {
            Logger.getLogger(Eva_3_14_APPEND_OBJ.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Eva_3_14_APPEND_OBJ.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void saveObjects(Person p) throws FileNotFoundException, IOException {
        FileOutputStream openArch = new FileOutputStream("C:\\Users\\invitado\\Documents\\NPersonas.per", true);
        ObjectOutputStream ouStream = new ObjectOutputStream(openArch);
        ouStream.writeObject(p);
        ouStream.close();
    }

    public static void readObjects() throws FileNotFoundException, IOException, ClassNotFoundException {
        Person p = null;
        FileInputStream openArch = new FileInputStream("C:\\Users\\invitado\\Documents\\NPersonas.per");
        ObjectInputStream oiStream = new ObjectInputStream(openArch);
        //Casting: de object a persona

        try {
            Object obj = oiStream.readObject();
            while (obj != null) {
                if (obj instanceof Person) {
                    p = (Person) obj;
                    System.out.println("Nombre: " + p.getName());
                    System.out.println("Apellido: " + p.getLastName());
                    System.out.println("Edad: " + p.getAge());
                }
                obj = oiStream.readObject();
            }
        } catch (EOFException ex) {
            ex.printStackTrace();
        }

    }

}

class Person implements Serializable {

    private String name;
    private String lastName;
    private int age;

    public Person() {
        this.name = "";
        this.lastName = "";
        this.age = 0;
    }

    public Person(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
