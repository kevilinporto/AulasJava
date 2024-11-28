package Aula08_ManipulacaoDeArquivos.Exercícios;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Exercício01 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        File alunos = new File("src\\Aula08_ManipulacaoDeArquivos\\Exercícios\\alunos.txt");
        String[] matrizAlunos = new String[5];

        for (int i = 0; i < matrizAlunos.length; i++) {
            System.out.print("Digite o nome do aluno: ");
            matrizAlunos[i] = scanner.next();
            String[] tokens = matrizAlunos[i].split(";");
            for (String token : tokens) {
                System.out.println(token);
            }

            try {

                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(alunos, true));


                bufferedWriter.write(matrizAlunos[i]);
                bufferedWriter.close();


            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
        BufferedReader bufferedReader = new BufferedReader(new FileReader(alunos));
        String linha;
        while ((linha = bufferedReader.readLine()) != null) { //o readLine lê a linha inteira
            System.out.println(linha);
        }
        bufferedReader.close();

    }

}

