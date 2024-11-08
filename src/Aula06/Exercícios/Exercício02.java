package Aula06.Exercícios;

import java.util.Scanner;

public class Exercício02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] vetor = {"A", "B", "C", "D", "E", "F"};
        boolean teste = false;
        String caractere;
        System.out.println("Digite um caractere: ");
        caractere = scanner.nextLine();

        for (String vetores : vetor) {
            if (vetores.equals(caractere)){
                System.out.println("Caractere encontrado na posição: " + vetor);
                break;
            }else{
                System.out.println("Caractere não encontrado");

            }

        }

    }
}
