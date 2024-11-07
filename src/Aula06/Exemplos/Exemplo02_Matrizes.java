package Aula06.Exemplos;

public class Exemplo02_Matrizes {
    public static void main(String[] args) {
        int [][] numeros = new int[2][3]; //array de 2 linhas e 3 colunas

        //A ordem é linhas e colunas. Funciona como uma tabela, para percorrê-la é necessário inserir o índice

        numeros [0][0] = 1;
        numeros [0][1] = 2;
        numeros [0][2] = 3;
        numeros [1][0] = 4;
        numeros [1][1] = 5;
        numeros [1][2] = 6;

        System.out.println("Valor da matriz na posição [0][2] = " + numeros [0][2]);

        String [][] matrizNomes = new String[2][2];

        matrizNomes [0][0] = "Kevilin";
        matrizNomes [0][1] = "Vitoria";
        matrizNomes [1][0] = "Porto";
        matrizNomes [1][1] = "Beatriz";

        System.out.println("Valor da matriz na posição [1][0] = " + matrizNomes [1][1]);
    }
}
