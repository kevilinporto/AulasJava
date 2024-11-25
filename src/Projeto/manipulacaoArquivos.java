package Projeto;

import java.io.*;

public class manipulacaoArquivos {

    public static void armazenarDados (String [][] matriz) {

        File arquivo = new File("src\\Aula08_ManipulacaoDeArquivos\\Exemplos\\arquivo.txt");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(arquivo))) {
            for (String[] linha : matriz) {
                if (linha[0] != null) { // Apenas grava usuários não nulos
                    for (int j = 0; j < linha.length; j++) {
                        writer.write(linha[j]); // Escreve o elemento
                        if (j < linha.length - 1) {
                            writer.write(" - "); // Adiciona separador, exceto no último elemento
                        }
                    }
                    writer.write("\n"); // Adiciona uma quebra de linha após cada linha da matriz
                }
            }
            System.out.println("Dados salvos com sucesso no arquivo: " + arquivo);
        } catch (IOException e) {
            System.out.println("Erro ao salvar os dados: " + e.getMessage());
        }
    }
}