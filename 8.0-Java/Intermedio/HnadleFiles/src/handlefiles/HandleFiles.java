package handlefiles;

import java.io.*;

public class HandleFiles {

    public static void createFile(String filename){
        // Crea el archivo
        File file = new File(filename);

        try {
            // Lo guarda en memoria
            PrintWriter out = new PrintWriter(file);
            out.close();
        } catch (FileNotFoundException e) {
            System.out.println("No se pudo crear el archivo");
            e.printStackTrace();
        }
    }
    
    public static void writeFile(String filePath, String fileContent){
        File file = new File(filePath);

        try {
            // Abre el objecto PrintWriter
            PrintWriter out = new PrintWriter(file);
            // Escribimos en el archivo
            out.println(fileContent);
            // Guardamos
            out.close();
        } catch (FileNotFoundException e) {
            System.out.println("No se pudo crear el archivo");
            e.printStackTrace();
        }
    }

    public static void appendFile(String filePath, String fileContent){
        File file = new File(filePath);

        try {
            // Abre el objecto PrintWriter
            PrintWriter out = new PrintWriter(new FileWriter(file, true));
            // Escribimos en el archivo
            out.println(fileContent);
            // Guardamos
            out.close();
        } catch (FileNotFoundException e) {
            System.out.println("No se pudo crear el archivo");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readFile(String filePath ){
        var file = new File(filePath);
        try {
            var input = new BufferedReader(new FileReader(file));
            var readLine = "Start reading file: ";
            while(readLine != null){
                System.out.println(readLine);
                readLine = input.readLine();
            }
            input.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
