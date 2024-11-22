package Aula08_ManipulacaoDeArquivos.Exemplos;

import java.io.File;
import java.io.IOException;

public class Exemplo01 {
    public static void main(String[] args) {
        //Caminho do arquivo a ser criado
        File arquivo = new File("src\\Aula08_ManipulacaoDeArquivos\\Exemplos\\arquivo.txt"); //no final, dê nome ao arquivo

        if (arquivo.exists()) { // verifica se o arquivo existe
            System.out.println("O arquivo já existe!");
        } else { // se não existir
            try { // toda vez que um erro durante a execução pode acontecer, é necessáro envolver o bloco de código problemático em um try e catch
                if (arquivo.createNewFile()) { // cria o arquivo
                    System.out.println("Arquivo criado com sucesso: " + arquivo.getName());
                } else { // se não conseguir, exiba a falha
                    System.out.println("Falha ao criar o arquivo.");
                }
            } catch (IOException e) { // criar um arquivo pode dar um erro de entrada e saída
                throw new RuntimeException(e);
            }
        }


    }
}
