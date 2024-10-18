package aula04_EstruturaDecisao.exercicios;

import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
        double valorProduto;
        double valorDesc;
        double valorTotal;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor total do produto: ");
        valorProduto = scanner.nextDouble();

        if (valorProduto >= 100) {
        System.out.println("Digite a porcentagem do desconto: ");
        valorDesc = scanner.nextDouble();

        valorDesc = valorProduto * 0.1;
        valorTotal = valorProduto - valorDesc;
        System.out.println("O produto, com o desconto fica: " + valorTotal);

        } else {

            System.out.println("Valor a ser pago: " + valorProduto);

        }

    }
}
