package curso;

import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by x001 on 12/12/16.
 */
public class StandardStreams {

    /***
     *
     * São streams que permitem o usuario receber entrada do teclado e produzir saida para tela
     * do computador.
     *
     * Existem 3 tipos de Streams
     *
     * Standard Input - é usado para entrada de dados. Normalmente o teclado é usado como entrada
     * e respresentado como System.in
     *
     * Standard Output - é usado para exibir dados produzido pela o programa do usuario e normalmente
     * é uma tela. é representado como System.out.
     *
     * Standard Error - é usado para exibir informações de erros produzido pelo programa
     * do usuario. é representado como System.err
     *
     */

        public static void main(String args[]) throws IOException {
            InputStreamReader cin = null;

            try {
                cin = new InputStreamReader(System.in);
                System.out.println("Digita caracters, tecla 'q' to para sair.");
                char c;
                do {
                    c = (char) cin.read();
                    System.out.print(c);
                }   while(c != 'q');
            }finally {
                if (cin != null) {
                    cin.close();
                }
            }
        }
    }
