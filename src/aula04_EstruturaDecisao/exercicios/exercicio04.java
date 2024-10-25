package aula04_EstruturaDecisao.exercicios;

import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double vendas;
        double porcentagem;
        double comissao;

        System.out.println("Digite o valor das vendas: ");
        vendas = scanner.nextInt();

        if (vendas > 0 || vendas < 1000) {
        porcentagem = 0.05;
        comissao = vendas * porcentagem;

        System.out.println("O valor total da comissão é: " + comissao);

        } else if (vendas >= 1000 && vendas <= 5000) {
        porcentagem = 0.1;
        comissao = vendas * porcentagem;
        System.out.println("O valor total da comissão é: " + comissao);

        } else if (vendas > 5000){
        porcentagem = 0.15;
        comissao = vendas * porcentagem;
        System.out.println("O valor total da comissão é: " + comissao);

        } else {
            System.out.println("Valor de vendas inválido.");


        } scanner.close();
    }
}
