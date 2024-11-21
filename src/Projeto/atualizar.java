package Projeto;

import java.util.Scanner;

public class atualizar {
    public static void atualizarCadastro(String[][] matriz, int contador, Scanner scanner) {
        System.out.print("Digite o nome do aluno para atualizar: ");
        String nomeConsulta = scanner.nextLine();
        boolean encontrado = false;

        for (int i = 0; i < contador; i++) {
            if (matriz[i][0].equalsIgnoreCase(nomeConsulta)) {
                System.out.println("Aluno encontrado. Atualize as informações:");

                System.out.print("Insira o novo nome: ");
                matriz[i][0] = scanner.nextLine();

                System.out.print("Insira o novo número da matrícula: ");
                matriz[i][1] = scanner.nextLine();

                System.out.print("Insira o novo número de telefone: ");
                matriz[i][2] = scanner.nextLine();

                System.out.println("Cadastro atualizado com sucesso!");
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Aluno não encontrado.");
        }
    }
}
