package Aula07_Funcoes.Exercícios;

import java.util.Scanner;

public class Exercício10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o peso em kilogramas: ");
        double pesoDigitar = scanner.nextDouble();

        System.out.print("Digite a altura em metros: ");
        double alturaDigitar = scanner.nextDouble();

        double imc = calcularIMC(pesoDigitar, alturaDigitar);
        System.out.println("O IMC é: " + imc);
        System.out.println(classificarImc(imc));

    }

    //função para calcular o IMC
    public static double calcularIMC(double peso, double altura) {

        return peso / (altura * altura);
    }

    //função adicional para classificar o IMC
    public static String classificarImc(double imc) {
        if (imc < 18.5) {
            return "Abaixo do peso";
        } else if (imc < 24.9) {
            return "Peso normal";
        } else if (imc < 29.9) {
            return "Sobrepeso";
        } else {
            return "Obesidade";
        }

    }

}
