package Aula02.exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        System.out.println("Digite as horas trabalhadas: ");
        int horas = scanner.nextInt();
        System.out.println("Digite o valor pago por hora: ");
        int valorHora = scanner.nextInt();
        int total = horas * valorHora;

        System.out.println("O salário total é: " + total);

        scanner.close();

    }
}
