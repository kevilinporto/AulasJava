package Aula06.Exercícios;

import java.util.Scanner;

public class Exercício03 {
    public static void main(String[] args) {
        boolean [] vetor = new boolean[8];
        int contador = 0;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite true ou false para a posição " + i + ":");
            boolean resposta = scanner.nextBoolean();
            vetor[i] = resposta;
            if (resposta == true){
            contador++;
            }
        }
        System.out.println("A quantidade de true digitados é: " + contador);

    }
}