package Projeto;

import java.util.Scanner;

public class consulta {
    // Função para consultar alunos pelo nome
    public static void consultarAluno(String[][] matriz, int contador, Scanner scanner) {
        System.out.print("Digite o nome do aluno para consulta: ");
        String nomeConsulta = scanner.nextLine();
        boolean encontrado = false;

        for (int i = 0; i < contador; i++) {
            if (matriz[i][0].equalsIgnoreCase(nomeConsulta)) {
                System.out.println("Aluno encontrado:");
                System.out.println("\tNome: " + matriz[i][0]);
                System.out.println("\tMatrícula: " + matriz[i][1]);
                System.out.println("\tTelefone: " + matriz[i][2]);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Aluno não encontrado.");
        }
    }
}
