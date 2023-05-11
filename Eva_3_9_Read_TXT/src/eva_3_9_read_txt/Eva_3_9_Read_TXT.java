package eva_3_9_read_txt;

import java.io.IOException;
import java.nio.file.Files;
import static java.nio.file.Files.readAllLines;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Eva_3_9_Read_TXT {
    final static String RUTA = "C:\\ArchivosJAVA\\Prueba.txt";
    public static void main(String[] args) {
        try {
            readUsingFiles(RUTA);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void readUsingFiles(String ruta) throws IOException {
        //Construimos una ruta en base a la cadena de texto
        Path path = Paths.get(ruta);
       /* List<String> lineasR = Files.readAllLines(path, null);
        System.out.println("Resultadoo");
        for (int i = 0; i < lineasR.size(); i++) {
            System.out.println(lineasR.get(i));
               
            
        }*/
        
        byte[] bytes = Files.readAllBytes(path);
        System.out.println(new String(bytes));
    }

}
