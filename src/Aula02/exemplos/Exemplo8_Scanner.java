package Aula02.exemplos;

 import java.util.Scanner;

public class Exemplo8_Scanner {
    public static void main(String[] args) {
        String texto = "Este texto está na primeira linha \nEste texto está na segunda linha" +
                "\n \tEste texto está na terceira linha e com tabulação";
        System.out.println(texto);


        Scanner scanner = new Scanner (System.in);
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine(); // esse comando serve para consumir o \n deixado pelo nextInt na memória ao digitar o número e dar Enter (\n)
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Seu nome é " + nome + " e sua idade é " + idade);

    }
}
