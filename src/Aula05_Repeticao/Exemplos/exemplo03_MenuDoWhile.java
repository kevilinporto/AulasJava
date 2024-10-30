package Aula05_Repeticao.Exemplos;

import java.util.Scanner;

public class exemplo03_MenuDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Escolha uma opção: ");
            System.out.println("\t1 - Para a opção 1");
            System.out.println("\t2 - Para a opção 2");
            System.out.println("\t3 - Para a opção 3");
            System.out.println("\t4 - Sair");

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
                case 4:
                    System.out.println("Tchau");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 4); // se a opção selecionada for igual a quatro, que é a opção de saída, o programa sairá da repetição do while
        System.out.println("Fim do programa");
        scanner.close();
    }
}
