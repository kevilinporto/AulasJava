package Projeto;

import java.util.Scanner;

public class menuPrincipal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] matriz = new String[13][3];  // Matriz 13x3 para armazenar nome, matrícula e telefone
        int opcao;
        int contador = 0;  // Controla quantos alunos foram cadastrados

        do {
            System.out.println("""
                        1 - CADASTRO
                        2 - CONSULTA
                        3 - ATUALIZAÇÃO DE CADASTRO
                        4 - DELETAR USUÁRIO
                        5 - FIM
                    """);


            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer do scanner

            switch (opcao) {
                case 1:
                    cadastroUsuario.cadastrarAluno(matriz, contador);
                    contador++;
                    break;

                case 2:
                    consultarUsuario.consultarAluno(matriz, contador, scanner);
                    break;

                case 3:
                    atualizarUsuario.atualizarCadastro(matriz, contador, scanner);
                    break;

                case 4:
                    //função para deletar usuário ainda não terminada
                    deletarUsuario.excluirUsuario(matriz, contador);
                    break;

                case 5:
                    System.out.println("Fim do programa.");
                    break;

                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } while (opcao != 5);

        scanner.close();
    }



}