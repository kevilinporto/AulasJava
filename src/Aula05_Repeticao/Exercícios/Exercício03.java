package Aula05_Repeticao.Exercícios;

import java.util.Scanner;

public class Exercício03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1;
        int fatorial = 1;

        do {
            System.out.println("Digite o número para calcular o fatorial: ");
            num1 = scanner.nextInt();

        }while (fatorial > 0);
        num1 = num1 * fatorial;
        fatorial ++;
        System.out.println("A resposta é " + num1);




    }
}
