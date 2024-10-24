package Aula05_Repeticao;

import java.util.Scanner;

public class exemplo02_DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idade;

        do { //com o do while não é necessário inicializar a variável antes, já que ele executará primeiro antes de comparar
            System.out.println("Digite sua idade: ");
            idade = scanner.nextInt();
            System.out.println(idade);
        } while (idade < 18);
        System.out.println("Você é maior de idade");
        scanner.close();

    }
}
