package Aula06.Exercícios;

import java.util.Scanner;

public class Exercício08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] matriz = new double[2][2];

        for (int i = 0; i < matriz.length; i++) {//for externo
            double somaLinha = 0; //para somar as linhas separadamente, é preciso colocar a variável da soma no loop for externo, para assim que ele terminar
            //a soma da linha 0, resetar o valor da soma para 0 para calcular a soma da linha 1
            for (int j = 0; j < matriz[i].length; j++) {//for interno
                System.out.print("Digite o valor da linha " + i + ", coluna " + j + ": ");
                matriz[i][j] = scanner.nextDouble();
                somaLinha += matriz[i][j];
            }//for interno

            System.out.println("A soma dos valores da linha " + i + " é: " + somaLinha);
        }//for externo

    }
}
