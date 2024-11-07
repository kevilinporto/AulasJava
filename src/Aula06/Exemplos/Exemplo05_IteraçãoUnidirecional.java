package Aula06.Exemplos;

public class Exemplo05_IteraçãoUnidirecional {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};

        for (int i = 0; i < numeros.length; i++) {//O tamanho é 5, o índice é 4. O código para no 4, pois 5 não é menor que 4.
            System.out.println(numeros[i]); //Percorre a matriz inteira.

        }

        String[] nomes = {"Kevilin", "Vitoria", "Porto"};
        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
    }
}