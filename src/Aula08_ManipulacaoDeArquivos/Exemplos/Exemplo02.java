package Aula08_ManipulacaoDeArquivos.Exemplos;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Exemplo02 {
    public static void main(String[] args) {

        File arquivo = new File("src\\Aula08_ManipulacaoDeArquivos\\Exemplos\\arquivo.txt");

        try {
            // escritor
            FileWriter fileWriter = new FileWriter(arquivo);
            fileWriter.write("Texto a ser gravado no arquivo.");
            fileWriter.close(); // é importantíssimo sempre fechar o fileWriter, se não o arquivo ficará trancado

            // leitor
            FileReader fileReader = new FileReader(arquivo);
            int caracter;
            while ((caracter = fileReader.read()) != -1) { // é necessário realizar um loop para ler todos os caracteres do arquivo de texto
                // enquanto for diferente de -1, ele continuará lendo o arquivo. Quando chegar em 0 caracteres, interromperá a leitura.
                System.out.print((char) caracter); // é necessário fazer o casting para char, se não será exibido o código ASCII da letra
            }
            fileReader.close(); // não se esqueça de fechar e manter o close fora do loop de repetição
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
