package aula04_EstruturaDecisao.exercicios;

import java.util.Scanner;

public class Exercício06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota do aluno: ");
        int nota = scanner.nextInt();

        if (nota >= 7 && nota <= 10){
            System.out.println("Aprovado!");

        }else if (nota >= 5 && nota <= 7) {
                System.out.println("Recuperação!");

        }else if (nota > -1 && nota < 5){
            System.out.println("Reprovado");
        }else {
            System.out.println("Nota inválida.");
        }
    }
}
