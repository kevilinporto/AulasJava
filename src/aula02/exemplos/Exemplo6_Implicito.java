package aula02.exemplos;
import java.util.Scanner;

public class Exemplo6_Implicito {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print("Digite um número inteiro: ");
        int varInt = scanner.nextInt();
        long varLong = varInt;
        float varFloat = varInt;

        System.out.println("O número inteiro digitado é: " + varInt);
        System.out.println("varLong = " + varLong);
        System.out.println("varFloat = " + varFloat);


        scanner.close();
    }
}
