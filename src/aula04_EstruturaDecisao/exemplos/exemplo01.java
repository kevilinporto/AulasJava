package aula04_EstruturaDecisao.exemplos;

import java.util.Scanner;

public class exemplo01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x;

        System.out.println("Digite um número: ");
         x = scanner.nextInt();

         if (x >= 30) { // é possível usar o if sem chaves, desde que o código do if tenha uma única linha.
             System.out.println("O número é maior ou igual a 30");
        }else {
             System.out.println("O número é menor que 30");
         }

         scanner.close();
    }
}
