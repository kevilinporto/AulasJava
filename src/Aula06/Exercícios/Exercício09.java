package Aula06.Exercícios;

public class Exercício09 {
    public static void main(String[] args) {
        int pares = 0;
        int [][] matriz = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}

        };

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] % 2 == 0){
                pares++;
                }
            }
        }
        System.out.println("A quantidade de números pares na matriz é: " + pares);
    }
}

