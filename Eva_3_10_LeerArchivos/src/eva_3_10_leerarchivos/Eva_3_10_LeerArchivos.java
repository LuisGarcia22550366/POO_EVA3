

package eva_3_10_leerarchivos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Eva_3_10_LeerArchivos {

    
    public static void main(String[] args) {
        
        String ruta = "C:\\Users\\invitado\\Documents\\Quiero morir";
        
        try {
            writeUsingFile(ruta + "Archivo.txt", "Quiero suicidarme \n " + "aaaaaaaaaaa");
            writerUsingWriter(ruta + "ola.txt", "Sigo con ganas de suicidarme \n" + "aaaaaaaaaa");
            writeUsingBufferedW(ruta + "ayuda.txt", "Ya quiero morir \n" + "aaaaaaaaaa");
        } catch (IOException ex) {
            Logger.getLogger(Eva_3_10_LeerArchivos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void writeUsingFile(String ruta, String data) throws IOException{
        Path path = Paths.get(ruta);
        Files.write(path, data.getBytes());
    }

    public static void writerUsingWriter (String ruta, String data) throws IOException{
        File file = new File(ruta);
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write(data);
        fileWriter.close();
    }
    
    public static void writeUsingBufferedW (String ruta, String data) throws IOException{
        File file = new File(ruta);
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        
        for (int i = 0; i < 900; i++) {
            bufferedWriter.write(data);
            bufferedWriter.write("\n");
            
        }
        bufferedWriter.close();
        fileWriter.close();
    }
}


