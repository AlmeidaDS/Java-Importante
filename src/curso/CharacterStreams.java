package curso;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by x001 on 12/12/16.
 */
public class CharacterStreams {
    /***
     *    Character Streams em Java são usadas para entrada e saida de dados de 16 bits Unicode
     * Existêm muitas classes relacionadas ao byte streams mas os mais utilizados são
     * FileInputStream e FileOutPut Stream. A seguir é um exemplo de um programa
     * que duplica um ficheiro.
     *
     * -------------------------------------------------------------------------------
     * O que é unicode?
     * Resposta -> Unicode é um padrão que permite aos computadores representar e manipular,
     * de forma consistente, texto de qualquer sistema de escrita existente.
     * Publicado no livro The Unicode Standard[1],[2] o padrão consiste de pouco mais de 107 mil caracteres[3],
     * um conjunto de diagramas de códigos para referência visual, uma metodologia para codificação e um conjunto
     * de codificações padrões de caracteres, uma enumeração de propriedades de caracteres como caixa alta
     * e caixa baixa, um conjunto de arquivos de computador com dados de referência,
     * além de regras para normalização, decomposição, ordenação alfabética e renderização.
     * FONTE> Wikipédia
     * --------------------------------------------------------------------------------
     */

        public static void main(String args[]) throws IOException {
            FileReader in = null;
            FileWriter out = null;

            try {
                in = new FileReader("entrada.txt");
                out = new FileWriter("saida.txt");

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

