package Aula06.Exercícios;

import java.util.Scanner;

public class Exercício07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;
        int matriz [][] = new int[3][3];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Digite o número da linha " + i + " e da coluna " + j + " : ");
                soma += scanner.nextInt();
            }

        }
        System.out.println("A soma de todos os elementos da matriz é: " + soma);
    }
}
