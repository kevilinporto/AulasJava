package aula04_EstruturaDecisao.exercicios;

import java.util.Scanner;

public class Exercício05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float horasTrabalhadas;
        float horasExtras;
        float porcentagem = 0.5f;

        System.out.println("Digite a quantidade de horas trabalhadas: ");
        horasTrabalhadas = scanner.nextFloat();

        if (horasTrabalhadas >= 40){
        horasExtras = horasTrabalhadas * porcentagem;
            System.out.println("O valor pago pelas horas extras é: " + horasExtras);
        }else {
            System.out.println("Não houveram horas extras.");
        }
        scanner.close();

    }
}
