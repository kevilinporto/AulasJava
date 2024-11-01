package Aula05_Repeticao.Exercícios;

import java.util.Scanner;

public class Exercício04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        boolean ehPrimo = true; // Inicializa como verdadeiro

        System.out.println("Digite um número para verificar se é primo: ");
        numero = scanner.nextInt();

        if (numero < 2) {
            ehPrimo = false;
        } else {
            for (int i = 2; i < numero; i++) {
                if (numero % i == 0) {
                    ehPrimo = false;
                    break;
                }
            }
        }


        if (ehPrimo) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é um número primo.");
        }

        scanner.close();
    }
}