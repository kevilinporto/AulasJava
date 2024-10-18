package aula04_EstruturaDecisao.exercicios;

import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args) {
        int idade;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua idade");
        idade = scanner.nextInt();

        if (idade >= 18) {
            System.out.print("Acesso permitido.");

        } else {
            System.out.print("Acesso negado.");
        }

        scanner.close();
    }
}