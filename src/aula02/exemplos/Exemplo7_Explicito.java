package aula02.exemplos;

import java.util.Scanner;

public class Exemplo7_Explicito {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Digite um número inteiro: ");

        int varInt = scanner.nextInt();
        // no casting explícito, se coloca em parênteses após = o tipo que ser quer converter
        short varShort = (short) varInt;
        byte varByte = (byte) varShort;
        
        System.out.println("O número inteiro digitado é: " + varInt);
        System.out.println("varShort = " + varShort);
        System.out.println("varByte = " + varByte);

        System.out.print("Digite um número decimal: ");
        double varDouble = scanner.nextDouble();
        float varFloat = (float) varDouble;
        System.out.println("O número decimal digitado é: " + varDouble);
        System.out.println("varFloat = " + varFloat);



        scanner.close();


    }
}
