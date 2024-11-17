package Aula07_Funcoes.Exercícios;

import java.util.Scanner;

public class Exercício06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroDigitado;
        System.out.print("Digite um número para verificar se ele é par: ");
        numeroDigitado = scanner.nextInt();
        System.out.println(verificarPar(numeroDigitado));


    }
    public static boolean verificarPar (int numero){

        return numero % 2 == 0;
    }
}
