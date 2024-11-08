package Aula06.Exercícios;

import java.util.Scanner;

public class Exercício02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String aviso = "Caractere não encontrado";
        String[] vetor = {"A", "B", "C", "D", "E", "F"};
        String caractere;
        System.out.println("Digite um caractere: ");
        caractere = scanner.nextLine();

        for (int i = 0; i < vetor.length; i++) {
            if (caractere.equals(vetor[i])){
            aviso = "Caractere encontrado na posição: " + i;
                break;
            }
        }
        System.out.println(aviso);
    }
}