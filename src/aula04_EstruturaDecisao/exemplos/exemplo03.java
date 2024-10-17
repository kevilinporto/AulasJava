package aula04_EstruturaDecisao.exemplos;

import java.util.Scanner;

public class exemplo03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a idade: ");
        int idade = scanner.nextInt();

        if (idade >= 0 && idade <= 12) {
            System.out.println("Você é criança");
        } else if (idade >= 13 && idade <= 17) {
            System.out.println("Você é adolescente");
        } else if (idade >= 18 && idade <= 64) {
            System.out.println("Você é adulto");
        } else if (idade >= 65){
            System.out.println("Você é idoso");
        }else {
            System.out.println("Idade inválida");
        }
    }
}