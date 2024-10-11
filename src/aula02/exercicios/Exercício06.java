package aula02.exercicios;

import java.util.Scanner;

public class Exercício06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        int var1 = scanner.nextInt();

        System.out.println("Digite outro valor: ");
        int var2 = scanner.nextInt();
        boolean resposta;

        resposta = var1 > var2;
        System.out.println(var1 + " > " + var2 + " = " + resposta);

        resposta = var1 < var2;
        System.out.println(var1 + " < " + var2 + " = " + resposta);

        resposta = var1 >= var2;
        System.out.println(var1 + " >= " + var2 + " = " + resposta);

        resposta = var1 <= var2;
        System.out.println(var1 + " <= " + var2 + " = " + resposta);

    }
}
