package Aula07_Funcoes.Exercícios;

import java.util.Scanner;

public class Exercício07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite três números para exibir o maior entre eles: ");
        int maior = maiorNumero(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        System.out.println(maior);

    }
    public static int maiorNumero (int num1, int num2, int num3){
        int maior;

        if (num1 >= num2 && num1 >= num3){
            maior = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            maior = num2;
        }else{
            maior = num3;
        }

        return maior;
    }
}
