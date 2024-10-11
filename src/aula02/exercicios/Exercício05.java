package aula02.exercicios;

import java.util.Scanner;

public class Exercício05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        int nota1 = scanner.nextInt();

        System.out.println("Digite a segunda nota: ");
        int nota2 = scanner.nextInt();

        System.out.println("Digite a terceira nota: ");
        int nota3 = scanner.nextInt();

        int total = + nota1 + nota2 + nota3;

        System.out.println("A nota total é: " + total);
    }
}
