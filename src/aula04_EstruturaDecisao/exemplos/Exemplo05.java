package aula04_EstruturaDecisao.exemplos;

import java.util.Scanner;

public class Exemplo05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        System.out.println("Escolha uma opção: ");
        System.out.println("\t1 - Para a opção 1");
        System.out.println("\t2 - Para a opção 2");
        System.out.println("\t3 - Para a opção 3");

        opcao = scanner.nextInt();

        switch (opcao){
            case 1:
                System.out.println("Você escolheu a opção 1.");
                break;
            case 2:
                System.out.println("Você escolheu a opção 2.");
                break;
            case 3:
                System.out.println("Você escolheu a opção 3.");
                break;
            default:
                System.out.println("Opção inválida.");
        }
        scanner.close();
    }
}
