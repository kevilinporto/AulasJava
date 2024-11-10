package Aula06.Exercícios;

import java.util.Scanner;

public class Exercício05 {
    public static void main(String[] args) { //psvm
        Scanner scanner = new Scanner(System.in);
        String nomeDigitado;
        boolean encontrado = false;
        String [] nomes = {"Kevilin", "Vitoria", "Beatriz"};

        System.out.print("Digite um nome para verificá-lo: ");
        nomeDigitado = scanner.nextLine();

        for (int i = 0; i < nomes.length; i++) {//for

            if (nomeDigitado.equals(nomes[i])) {
                encontrado = true;
                break;
            }
        }//for

        if (encontrado == true){
            System.out.println("Nome " + nomeDigitado + " está presente no vetor.");
        }else{
            System.out.println("Nome não encontrado");
        }

    }//psvm
}
