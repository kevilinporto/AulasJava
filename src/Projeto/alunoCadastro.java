package Projeto;

import java.util.Scanner;

public class alunoCadastro {
    public static void cadastrarAluno(String[][] matriz, int contador) {
        Scanner scanner = new Scanner(System.in);

        if (contador < matriz.length) {
            System.out.println("Cadastro do aluno " + (contador + 1));
            System.out.print("Insira o nome: ");
            matriz[contador][0] = scanner.nextLine();
            System.out.print("Insira o número da matrícula: ");
            matriz[contador][1] = scanner.nextLine();
            System.out.print("Insira o número de telefone: ");
            matriz[contador][2] = scanner.nextLine();

            System.out.println("Cadastro realizado com sucesso!");
        } else {
            System.out.println("Limite de cadastros atingido.");
        }
    }

}

