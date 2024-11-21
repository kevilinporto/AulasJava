package Aula07_Funcoes.Exercícios;

import java.util.Scanner;

public class Exercício04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a temperatura em graus celsius para converter em fahrenheit: ");
        double conversao = converterCelsiusParaFahrenheit(scanner.nextDouble());
        System.out.println("A temperatura digitada em fahrenheit é: " + conversao);
    }

    public static double converterCelsiusParaFahrenheit(double celsius) {
        return celsius * 1.8 + 32;
    }
}
