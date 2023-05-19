package eva_3_12_serializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Eva_3_12_Serializable {

    public static void main(String[] args) {
        
        try {
            Person p = new Person("Luis", "Garcia", 18);
            saveObjects(p);
            try {
                Person resu = readObjects();
                System.out.println("Nombre: " + resu.getName());
                System.out.println("Apellido" + resu.getLastName());
                System.out.println("Edad: " + resu.getAge());
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Eva_3_12_Serializable.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Eva_3_12_Serializable.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (IOException ex) {
            Logger.getLogger(Eva_3_12_Serializable.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    public static void saveObjects(Person p) throws FileNotFoundException, IOException{
        FileOutputStream openArch = new FileOutputStream("C:\\Users\\invitado\\Documents\\NetBeansProjects");
        ObjectOutputStream ouStream = new ObjectOutputStream(openArch);
        ouStream.writeObject(p);
        ouStream.close();
    }
    
    public static Person readObjects() throws FileNotFoundException, IOException, ClassNotFoundException{
        Person p = null;
        FileInputStream openArch = new FileInputStream("C:\\Users\\invitado\\Documents\\NetBeansProjects");
        ObjectInputStream oiStream = new ObjectInputStream(openArch);
        //Casting: de object a persona
        p = (Person)oiStream.readObject();
        return p;
    }

}

class Person implements Serializable{

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
