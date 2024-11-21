package Projeto;

import java.util.Scanner;

public class menuprincipal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] matriz = new String[13][3];  // Matriz 13x3 para armazenar nome, matrícula e telefone
        int opcao;
        int contador = 0;  // Controla quantos alunos foram cadastrados

        do {
            System.out.println("Selecione uma opção: ");
            System.out.println("\t1 - CADASTRO");
            System.out.println("\t2 - CONSULTA");
            System.out.println("\t3 - ATUALIZAÇÃO DE CADASTRO");
            System.out.println("\t4 - FIM");

            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer do scanner

            switch (opcao) {
                case 1:
                    alunoCadastro.cadastrarAluno(matriz, contador);
                    contador++;
                    break;

                case 2:
                    consulta.consultarAluno(matriz, contador, scanner);
                    break;

                case 3:
                    atualizar.atualizarCadastro(matriz, contador, scanner);
                    break;

                case 4:
                    System.out.println("Fim do programa.");
                    break;

                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } while (opcao != 4);

        scanner.close();
    }



}
