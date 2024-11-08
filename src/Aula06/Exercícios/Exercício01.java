package Aula06.Exercícios;

public class Exercício01 {
    public static void main(String[] args) {

        int soma = 0;
        int [] numeros = {2, 4, 6, 8, 10};

        for (int numero : numeros) {
            soma = soma + numero;

        }
        System.out.println("A soma total é: " + soma);
        
    }
}
