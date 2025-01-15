
    package ARCHIVOS;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileManager {

    public void guardarDatos(String nombreArchivo, String datos) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(nombreArchivo, true))) {
            bw.write(datos);
            bw.newLine();
        } catch (IOException ex) {
            System.err.println("Error al grabar Archivo: " + ex.getMessage());
        }
    }

    public void modificarLinea(String nombreArchivo, String lineaAntigua, String nuevaLinea) {
        File archivo = new File(nombreArchivo);
        File archivoTemporal = new File("temp.txt");

        try {
            if (archivo.exists()) {
                BufferedReader br = new BufferedReader(new FileReader(archivo));
                BufferedWriter bw = new BufferedWriter(new FileWriter(archivoTemporal));

                String linea;

                while ((linea = br.readLine()) != null) {
                    if (linea.equals(lineaAntigua)) {
                        bw.write(nuevaLinea);
                        bw.newLine();
                    } else {
                        bw.write(linea);
                        bw.newLine();
                    }
                }

                br.close();
                bw.close();

                if (archivo.delete()) {
                    archivoTemporal.renameTo(archivo);
                    System.out.println("Archivo modificado correctamente.");
                } else {
                    System.out.println("Error al modificar el archivo.");
                }

            } else {
                System.out.println("El archivo no existe.");
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void eliminarArchivo(String nombreArchivo) {
        try {
            File archivo = new File(nombreArchivo);
            if (archivo.exists()) {
                archivo.delete();
                System.out.println("Archivo Borrado");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

