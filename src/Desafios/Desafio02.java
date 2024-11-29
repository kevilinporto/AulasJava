package Desafios;

import java.util.Scanner;

public class Desafio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String menu = """
                _____________________________________________
                |   Escolha uma opção:                      |
                |       1 - Exibir cadastro completo        |
                |       2 - Inserir novo usuário            |
                |       3 - Atualizar cadastro por ID       |
                |       4 - Deletar cadastro por ID         |
                |       5 - Sair                            |
                |___________________________________________|
                """;
        int opcao;
        do {
            System.out.println(menu);
            opcao = scanner.nextInt();
            scanner.nextLine(); //limpa o \n

            switch (opcao) {
                case 1:
                    exibirUsuario();
                    break;
                case 2:
                    cadastrarUsuario();
                    break;

                case 3:
                    atualizarUsuario();
                    break;

                case 4:
                    deletarUsuario();
                    break;

                case 5:
                    System.out.println("Fim do programa...");
                    break;

                default:
                    System.out.println("Opção inválida");
            }
        } while (opcao != 5);

    }

    public static void exibirUsuario() {
        System.out.println("Exibir");

    }

    public static void cadastrarUsuario() {
        System.out.println("Cadastrar");

    }

    public static void atualizarUsuario() {
        System.out.println("atualizarUsuario");

    }

    public static void deletarUsuario() {
        System.out.println("deletar");

    }
}
