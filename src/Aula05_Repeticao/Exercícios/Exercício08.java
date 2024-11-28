package Aula05_Repeticao.Exercícios;

import java.util.Scanner;

public class Exercício08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeros;
        int pares = 0;
        int impares = 0;

        for (int i = 1; i <= 10 ; i++) {

            System.out.println("Digite um número: ");
            numeros = scanner.nextInt();
            if (numeros % 2 == 0) {
            pares++;
            }else impares++;
        }
        System.out.println("A quantidade de números pares é: " + pares);
        System.out.println("A quantidade de números ímpares é: " + impares);
    }

}
