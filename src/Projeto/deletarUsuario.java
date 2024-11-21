package Projeto;

import java.util.Scanner;

public class deletarUsuario {
    public static void excluirUsuario(String [][] matriz, int contador){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do usuário a ser deletado: ");
        String nome = scanner.nextLine();
        int opcao = 0;
        for (int i = 0; i < matriz.length; i++) {
            if (matriz[i][0].equals(nome)){

                System.out.println("""
                        Usuário encontrado.
                        
                        Tem certeza que deseja deletá-lo?
                        
                        1 - SIM
                        2 - NÃO
                        """);
                switch (opcao){
                    case 1:
                        System.out.println("Deletando usuário...");
                        matriz[i][0] = null;
                        matriz[i][1] = null;
                        matriz[i][2] = null;
                        System.out.println("Usuário excluído com sucesso");

                    case 2:
                        System.out.println("Cancelando");
                }


            }

        }
    }
}
