package ejercicio2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputFilter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.imageio.stream.FileImageInputStream;

/**
 * Clase encargada de realizar la lectura y escritura de objetos Recetario en
 * archivos binarios.
 *
 * @author profe
 */
public class RecetarioIO {

    // Ruta del archivo donde se lee y escribe el objeto Recetario
    private String rutaArchivo;

    /**
     * Método constructor
     *
     * @param archivo Ruta del archivo donde se lee y escribe el objeto
     * Recetario
     */
    public RecetarioIO(String archivo) {
        this.rutaArchivo = archivo;
    }

    // -----------------------------------------------------
    // Ejercicio 2: Métodos que debe implementar el alumnado
    // -----------------------------------------------------
    /**
     * Método que lee, desde un archivo binario, un objeto Recetario
     * serializado.
     *
     * @return Objeto Recetario que estaba almacenado en el archivo binario.
     */
    public Recetario leer() throws FileNotFoundException, IOException, ClassNotFoundException {

        FileInputStream ficheroE = new FileInputStream("str.save");
        ObjectInputStream objetosteam = new ObjectInputStream(ficheroE);
        Recetario recetario1 = (Recetario) objetosteam.readObject();
        objetosteam.close();
        return recetario1;

    }

    /**
     * Método que escribe, en un archivo binario, un objeto Recetario
     * serializable.
     *
     * @param recetario Objeto Recetario serializable para almacenar en el
     * archivo binario.
     */
    public void escribir(Recetario recetario) throws FileNotFoundException, IOException {
        // Incluir el código que debe realizar el método
        
        FileOutputStream ficheroS = new FileOutputStream("str.save");
        ObjectOutputStream out = new ObjectOutputStream(ficheroS);
        out.writeObject(recetario);
        out.close();
        
    }
}
