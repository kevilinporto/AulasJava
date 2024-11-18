package Projeto;

import java.util.Scanner;

public class cadastro {
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
                    contador = cadastrarAluno(matriz, contador, scanner);
                    break;

                case 2:
                    consultarAluno(matriz, contador, scanner);
                    break;

                case 3:
                    atualizarCadastro(matriz, contador, scanner);
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

    // Função para cadastro de alunos
    public static int cadastrarAluno(String[][] matriz, int contador, Scanner scanner) {
        if (contador >= matriz.length) {
            System.out.println("Limite de cadastros atingido.");
            return contador; // Retorna o contador inalterado
        }

        System.out.println("Cadastro do aluno " + (contador + 1));
        System.out.print("Insira o nome: ");
        matriz[contador][0] = scanner.nextLine();

        System.out.print("Insira o número da matrícula: ");
        matriz[contador][1] = scanner.nextLine();

        System.out.print("Insira o número de telefone: ");
        matriz[contador][2] = scanner.nextLine();

        System.out.println("Cadastro realizado com sucesso!");
        return contador + 1; // Retorna o contador incrementado
    }

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

    // Função para atualizar o cadastro de alunos
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
