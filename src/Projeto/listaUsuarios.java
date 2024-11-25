package Projeto;

public class listaUsuarios {

    public static void exibirTodosUsuarios(String[][] matriz) {

        System.out.println("Usuários cadastrados:");

        for (int i = 0; i < matriz.length; i++) {
            System.out.println("Usuário" + (i + 1) + ":");
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println(matriz[i][j]);

            }
            System.out.println();
        }
    }
}
