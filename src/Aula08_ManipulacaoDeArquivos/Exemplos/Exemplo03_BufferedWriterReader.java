package Aula08_ManipulacaoDeArquivos.Exemplos;

import java.io.*;

public class Exemplo03_BufferedWriterReader {
    public static void main(String[] args) {
        // quando se quer escrever depois, e não sobrescrever o conteúdo do arquivo, utiliza-se o append

        File arquivo = new File("src\\Aula08_ManipulacaoDeArquivos\\Exemplos\\arquivo.txt");

        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(arquivo));
            bufferedWriter.write("Novo texto a ser gravado no arquivo");
            bufferedWriter.close(); // não esqueça de fechar

            BufferedReader bufferedReader = new BufferedReader(new FileReader(arquivo));
            String linha;
            while ((linha = bufferedReader.readLine()) != null){ //o readLine lê a linha inteira
                System.out.println(linha);
            }
            bufferedReader.close(); // feche fora do loop
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
