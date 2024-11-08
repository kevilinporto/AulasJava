package Aula06.Exemplos;

public class Exemplo08 {
    public static void main(String[] args) {
        int[][] numeros = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        for (int[] numero : numeros) {
            for (int i : numero) {
                System.out.println(i);
            }

        }

        String[][] nomes = {{"Kevilin", "Vitoria"}, {"Porto", "Beatriz"}};
        for (String[] nome : nomes) {//primeiro for itera sobre as linhas
            for (String s : nome) {// para saber a coluna é necessário acessar a linha
                System.out.println(s);
            }
        }
    }
}
