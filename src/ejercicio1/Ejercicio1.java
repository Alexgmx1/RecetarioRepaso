package ejercicio1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

/**
 * Ejercicio 1: Lectura/escritura de un recetario en ficheros de texto.
 *
 * @author profe
 */
public class Ejercicio1 {

    /**
     * Método principal.
     *
     * @param args argumentos que recibe el método
     */
    public static void main(String args[]) throws FileNotFoundException {

        //----------------------------------------------
        //          Declaración de variables 
        //----------------------------------------------
        // Constantes
        // Variables de entrada
        // Variables de salida
        // Variables auxiliares
        //----------------------------------------------
        //       Entrada de datos + Procesamiento
        //----------------------------------------------
        // Abrimos archivo de contactos ListadoRecetas.txt
        System.out.println("Abriendo archivo de recetas...");

        String rutaRecetas = System.getProperty("user.dir") + "/recursos/ListadoRecetas.txt";
        Recetario recetario1 = new Recetario();

        String s = "";

        File f = new File(rutaRecetas);
        try {

            BufferedReader br = new BufferedReader(new FileReader(f));

            while ((s = br.readLine()) != null) {

                String[] lineaProcesada = s.split(";");

                String nombre = lineaProcesada[0];
                String tipo = lineaProcesada[1];
                LocalDate fechaProcesada = LocalDate.parse(lineaProcesada[2]);

                String[] listaIngredientes = lineaProcesada[3].split(",");

                List<String> listaIngredientesProcesada = Arrays.asList(listaIngredientes);

                String[] listaPasos = lineaProcesada[4].split("\\.");
                List<String> listlistaPasosProcesada = Arrays.asList(listaPasos);

            }

        } catch (IOException ex) {
            System.out.println(ex);
        }

        System.out.println("Cerrando archivo de recetas...");

        System.out.println();

        //----------------------------------------------
        //              Salida de resultados 
        //----------------------------------------------
        // Abrimos el archivo de la agenda Recetario.txt
        System.out.println("Abriendo archivo del recetario...");

        System.out.println("Cerrando archivo del recetario...");

        System.out.println();
        System.out.println("Archivos cerrados y procesamiento finalizado");
        System.out.println("---------");
        System.out.println();
        System.out.println("Fin del programa.");
    }
}
