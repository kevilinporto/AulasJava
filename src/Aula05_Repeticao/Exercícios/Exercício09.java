package Aula05_Repeticao.Exercícios;

import java.util.Scanner;

public class Exercício09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numeroRandomD = Math.random() * 101;
        int numeroRandomI = (int) numeroRandomD; // é necessário fazer o casting para int pois o Math.random nos dá um número decimal
        System.out.println(numeroRandomI); // apenas para verificar o número aleatório.
        int numeroDigitado;
        System.out.println("Digite um número entre 1 e 100 para advinhar o valor aleatório escolhido pelo programa: ");

        do {
            numeroDigitado = scanner.nextInt();
            if (numeroDigitado != numeroRandomI) {
                System.out.println("Valor incorreto. Tente novamente");
            } else {
                System.out.println("Você acertou!");
            }
        } while (numeroDigitado != numeroRandomI);
    }
}
