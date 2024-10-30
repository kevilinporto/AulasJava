package Aula05_Repeticao.Exercícios;

public class Exercício02 {
    public static void main(String[] args) {
        //soma dos números pares de 1 a 100 utilizando o while

        int numAtual = 0;
        int soma = 0;

        while (numAtual < 101) {
            soma = soma + numAtual;
            numAtual += 2;

        }

        System.out.println(soma);
    }
}

