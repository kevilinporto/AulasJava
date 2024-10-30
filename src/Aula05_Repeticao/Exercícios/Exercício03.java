package Aula05_Repeticao.Exercícios;

import java.util.Scanner;

public class Exercício03 {
    public static void main(String[] args) {
        //calculo fatorial
        Scanner scanner = new Scanner(System.in);

        int resultado = 1;
        int fatorial;

        System.out.println("Digite o número para calcular seu fatorial: ");
        fatorial = scanner.nextInt();

        do {
            resultado = resultado * fatorial;
            fatorial --;

        }while (fatorial > 1);

        System.out.println("O resultado do fatorial é: " + resultado);
    }
}
