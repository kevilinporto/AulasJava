package Aula05_Repeticao.Exercícios;

import java.util.Scanner;

public class Exercício07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float nota = 0;

       do {
           System.out.println("Digite a nota: ");
           nota = scanner.nextFloat();
           if (nota >= 0 && nota <= 10);
           System.out.println("Nota inválida.");


       }while (nota < 0 || nota > 10);
        System.out.println("Nota inválida. Digite novamente");

    }
}
