package Projeto;

import java.util.Scanner;

public class deletarUsuario {
    public static void excluirUsuario(String[][] matriz, int contador) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do usuário a ser deletado: ");
        String nome = scanner.nextLine();
        int opcao;
        for (int i = 0; i < matriz.length; i++) {
            if (matriz[i][0].equals(nome)) {
                System.out.println("""
                        Usuário encontrado.
                        
                        Tem certeza de que deseja deletar todas as informações?
                        
                        1 - SIM
                        2 - NÃO
                        
                        """);
                opcao = scanner.nextInt();
                switch (opcao) {
                    case 1:
                        System.out.println("Deletando usuário...");
                        matriz[i][0] = null;
                        matriz[i][1] = null;
                        matriz[i][2] = null;
                        System.out.println("Usuário excluído com sucesso");
                        break;


                    case 2:
                        System.out.println("Cancelando");
                        break;

                    default:
                        System.out.println("Usuário não encontrado.");

                }


            }


        }
    }
}
