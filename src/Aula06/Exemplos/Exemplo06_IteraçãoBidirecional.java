package Aula06.Exemplos;

public class Exemplo06_IteraçãoBidirecional {
    public static void main(String[] args) {
        int[][] matrizNumeros = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        for (int linha = 0; linha < matrizNumeros.length; linha++) {//primeiro for itera sobre as linhas
            for (int colunas = 0; colunas < matrizNumeros[0].length; colunas++) {// para saber a coluna é necessário acessar a linha
                System.out.println(matrizNumeros[linha][colunas]);
            }

        }

        String[][] matrizNomes = {{"Kevilin", "Vitoria"}, {"Porto", "Beatriz"}};
        for (int linha = 0; linha < matrizNomes.length; linha++) {//primeiro for itera sobre as linhas
            for (int colunas = 0; colunas < matrizNomes[0].length; colunas++) {// para saber a coluna é necessário acessar a linha
                System.out.println(matrizNomes[linha][colunas]);
            }
        }
    }
}
