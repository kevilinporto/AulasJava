package Aula05_Repeticao.Exercícios;

import java.util.Scanner;

public class Exercício05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float nota = 0;
        float notatotal = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Digite a nota: ");;
            nota = scanner.nextInt();
            notatotal += nota;
            System.out.println(notatotal);

        }
        System.out.println("A média é: " + notatotal / 5);

    }
}
