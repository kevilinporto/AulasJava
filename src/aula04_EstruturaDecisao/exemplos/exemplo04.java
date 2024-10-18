package aula04_EstruturaDecisao.exemplos;

import java.util.Scanner;

public class exemplo04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String corSemaforo;
        System.out.print("Digite a cor do semáforo: ");

        corSemaforo = scanner.nextLine();

        switch (corSemaforo){
            case "verde","Verde":
                System.out.println("Siga!");
                break; //O break interrompe o switch. Se o case antes do break for verdadeiro, ele executará o código e terminará o switch. Se não, ele seguirá para o próximo case.
            case "amarelo","Amarelo":
                System.out.println("Atenção!");
                break;
            case "vermelho","Vermelho":
                System.out.println("Pare!");
                break;
            default:
                System.out.println("Nunca vi semáforo com a cor " + corSemaforo);

        }
        scanner.close();
    }
}
