package Aula02.exercicios;

import java.util.Scanner;

public class Exercício07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int var1 = scanner.nextInt();

        System.out.println("Digite o segundo número: ");
        int var2 = scanner.nextInt();

        System.out.println("Digite o terceiro número: ");
        int var3 = scanner.nextInt();

        System.out.println("Digite o quarto número: ");
        int var4 = scanner.nextInt();

        boolean cond1;
        boolean cond2;
        boolean cond3;

        cond1 = var1 > var2 && var3 > var4;
        System.out.println(var1 + " > " + var2 + " && " + var3 + " > " + var4 + " = " + cond1);

        scanner.close();



    }
}
