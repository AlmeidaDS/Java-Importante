package curso;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        // :::::::Algorithm::::::
        // Create new directory in /tmp/curso.
        // Create 4 files with random names manually.
        // Print file names on screen.
        // Loop over file names and save path of each file in an array
        // Ask user to type the new file name.
        // Rename files
        // Print new file names

        String caminho = "/tmp/curso";
        File dir = new File(caminho);
        dir.mkdir();


        File ficheiros[] = dir.listFiles();
        String[] caminhoDosFicheiros = new String[ficheiros.length];

        System.out.println("Numero de ficheiros: " + ficheiros.length);
        int contador = 0;
        for(File f : ficheiros ) {
            System.out.printf("Foram encontrados %d ficheiros na pasta %s. \n", ficheiros.length, f.getAbsoluteFile());
            caminhoDosFicheiros[contador] = f.getAbsolutePath();
            contador++;
        }
        renameFiles(ficheiros, caminhoDosFicheiros, caminho);

        File novosFicheiros[] = dir.listFiles();
        for (File f : novosFicheiros) {
            System.out.printf("Ficheiro foi renomeado com sucesso! %s. \n", ficheiros.length, f.getAbsoluteFile());
        }
    }
    public static void renameFiles(File[] file, String[] fNames, String caminho) {
        int length = file.length;
        String newFileNames[] = new String[length];
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < length; i++) {
            System.out.printf("Digite o nome do ficheiro %d: .", i);
            newFileNames[i] = scanner.nextLine();
            System.out.println       (newFileNames[i]);
            File input = new     File(fNames[i]);
            System.out.println(fNames[i]);
            File output = new File(caminho + "/"+ newFileNames[i]);
            input.renameTo(output);
        }
        scanner.close();
    }
}
