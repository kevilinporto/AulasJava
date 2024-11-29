package Projeto;

import java.util.Scanner;

public class menuPrincipal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int qtdUsuarios = 0;
        String [] cabecalho = {"ID", "Nome", "Telefone", "Email"};
        String[][] matrizCadastro = new String[qtdUsuarios][cabecalho.length];  // Matriz com três colunas para armazenar nome, matrícula e telefone
        int opcao;
        int contador = 0;  // Controla quantos alunos foram cadastrados

        do {
            System.out.println("""
                        1 - CADASTRO
                        2 - CONSULTA
                        3 - EXIBIR TODOS OS USUÁRIOS CADASTRADOS
                        4 - ATUALIZAÇÃO DE CADASTRO
                        5 - DELETAR USUÁRIO
                        6 - FIM
                    """);


            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer do scanner

            switch (opcao) {
                case 1:
                    // função para cadastrar o usuário
                    cadastroUsuario.cadastrarAluno(matrizCadastro, contador);
                    contador++;
                    manipulacaoArquivos.armazenarDados(matrizCadastro);
                    break;

                case 2:
                    // função para consultar o usuário no sistema
                    consultarUsuario.consultarAluno(matrizCadastro, contador, scanner);
                    break;

                case 3:
                    // função para exibir todos os usuários cadastrados
                    listaUsuarios.exibirTodosUsuarios(matrizCadastro);
                    break;

                case 4:
                    // função para atualizar o cadastro do usuário
                    atualizarUsuario.atualizarCadastro(matrizCadastro, contador, scanner);
                    break;

                case 5:
                    //função para deletar usuário. WIP
                    deletarUsuario.excluirUsuario(matrizCadastro, contador);
                    contador--;
                    break;

                case 6:
                    System.out.println("Fim do programa.");
                    break;

                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } while (opcao != 6);
        scanner.close();
    }


}
