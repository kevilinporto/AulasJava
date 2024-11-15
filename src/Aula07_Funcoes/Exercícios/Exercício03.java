package Aula07_Funcoes.Exercícios;

import java.util.Scanner;

public class Exercício03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número a ser dobrado");
        int resultado = dobrar(scanner.nextInt()); //Pede que o usuário passe o valor de number 1, que será dobrado
        System.out.println("O resultado é " + resultado);
    }
    public static int dobrar (int number1){
        return number1 * 2;
    }
}
