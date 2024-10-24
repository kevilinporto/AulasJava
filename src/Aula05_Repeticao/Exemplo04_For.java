package Aula05_Repeticao;

import java.util.Scanner;

public class Exemplo04_For {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Escolha um número para calcular a tabuada: ");
        int x = scanner.nextInt();

        for (int multiplicador = 0; multiplicador < 10; multiplicador++) {
        //parte 1 - cria e inicia // parte 2 - teste //parte 3 - incremento
        //a variável (contador)    // condicional

            System.out.println(x + " x " + multiplicador + " = " + x * multiplicador);
            scanner.close();

        }
    }
}
