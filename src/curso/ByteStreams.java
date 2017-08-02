package curso;

import java.io.*;

public class ByteStreams {

    /***
     * Byte Streams em Java são usadas para entrada e saida de dados de 8 bits
     * Existêm muitas classes relacionadas ao byte streams mas os mais utilizados são
     * FileInputStream e   FileOutPut Stream. A seguir é um exemplo de um programa
     * que duplica um ficheiro.
     *
     */
    public static void main(String args[]) throws IOException {
        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream("input.txt");
            out = new FileOutputStream("output.txt");

            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
        }finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}