package aula04_EstruturaDecisao.exemplos;

import java.util.Scanner;

public class Exemplo07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float desconto = 0.2f;
        float valorFinal = 0;


        System.out.println("Digite o valor da compra: ");
        float valorCompra = scanner.nextFloat();

        valorFinal = valorCompra >= 100.0f ? valorCompra - valorCompra * desconto : valorCompra;
                                             // resultado se verdadeiro            // resultado se falso

        System.out.println("O valor final da compra será : " + valorFinal);
        scanner.close();
    }

}
