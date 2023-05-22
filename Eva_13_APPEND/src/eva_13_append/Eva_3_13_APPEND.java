/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva_13_append;

import java.io.IOException;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author invitado
 */
public class Eva_3_13_APPEND {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String ruta = "C:\\Users\\invitado\\Documents\\Quiero morir";

        try {

            writeUsingBufferedW(ruta + "ayuda.txt", "HOLA \n" + "aaaaaaaaaa");
        } catch (IOException ex) {
            ex.printStackTrace();//Imprime la excpecion
        }

    }

    public static void writeUsingBufferedW(String ruta, String data) throws IOException {
        File file = new File(ruta);
        FileWriter fileWriter = new FileWriter(file, true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        for (int i = 0; i < 900; i++) {
            bufferedWriter.write(data);
            bufferedWriter.write("\n");

        }
        bufferedWriter.close();
        fileWriter.close();
    }

}
