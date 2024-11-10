package Aula06.Exercícios;

import java.util.Scanner;

public class Exercício06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valor; //variável para receber o valor digitado e atribuir à matriz
        int[][] matriz = new int[2][2];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Digite a valor para linha " + i + " coluna " + j);
                valor = scanner.nextInt();
                matriz[i][j] = valor;

            }
        }
        System.out.println("Valores inseridos na matriz: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Linha " + i + " coluna " + j + ": " + matriz [i][j]);
            }
        }


    }
}