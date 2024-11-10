package Aula06.Exercícios;

import java.util.Scanner;

public class Exercício09_ComScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[4][4];
        int valor;
        int pares = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Digite o valor para linha " + i + " coluna " + j + " : ");
                valor = scanner.nextInt();

                if (valor % 2 == 0){
                    pares++;
                }
            }
        }
        System.out.println("A quantidade de números de pares digitado é: " + pares);
        scanner.close();
    }
}
