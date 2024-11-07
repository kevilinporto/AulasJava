package Aula06.Exemplos;

public class Exemplo03_AtribuiçãoDireta {
    public static void main(String[] args) {
        //com chaves, podemos atribuir diretamente os valores das posições, sem usar o new.
        int [] numeros = {1, 2, 3, 4, 5};
        System.out.println("Valor da posição [4] = " + numeros [4]);

        String [] nomes = {"Kevilin", "Vitoria", "Porto"};
        System.out.println("Valor da posição [1] = " + nomes [2]);


    }
}
