package Aula06.Exemplos;

public class Exemplo07_EnhancedFor {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};


        for (int numero : numeros) {//O enhanced for serve para percorrer todos os elementos da matriz. Ele não funciona caso seja necessário pular algum elemento
            //a variável numero vai receber todos os elementos do vetor numeros
            System.out.println(numero);

        }

        String[] nomes = {"Kevilin", "Vitoria", "Porto"};
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}