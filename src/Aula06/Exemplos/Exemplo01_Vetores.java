package Aula06.Exemplos;

public class Exemplo01_Vetores {
    public static void main(String[] args) {
        //Estrutura de dados que armazena sequências de elementos do mesmo tipo

        //A declaração de um vetor em Java começa com a especificação do tipo de dado que o vetor vai armazenar, seguido por colchetes []
        // para indicar sua natureza de vetor.

        int[] numeros = new int[5]; //Cria vetor de inteiros com 5 elementos
        //Esta linha declara um vetor chamado numeros que é capaz de armazenar inteiros.

        numeros [0] = 10;
        numeros [1] = 20;
        numeros [2] = 30;
        numeros [3] = 40;
        numeros [4] = 50;

        //acessando os valores no vetor

        System.out.println("Primeiro elemento: " + numeros[0]); //saída 10;
        System.out.println("Segundo elemento: " + numeros[1]); //saída 20;

        String [] nomes = new String[3];

        nomes [0] = "Kevilin";
        nomes [1] = "Vitoria";
        nomes [2] = "Porto";

        System.out.println(nomes[2]);

    }
}
