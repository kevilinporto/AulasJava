package aula04_EstruturaDecisao.exercicios;

import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int produto;
        System.out.print("Digite o código do produto: ");
        produto = scanner.nextInt();

        switch (produto) {
            case 1:
                System.out.println("Eletrônico");
                break;
            case 2:
                System.out.println("Alimento");
                break;
            case 3:
                System.out.println("Vestuário");
                break;
            default:
                System.out.println("Código inválido.");

        }
        scanner.close();
    }
}
