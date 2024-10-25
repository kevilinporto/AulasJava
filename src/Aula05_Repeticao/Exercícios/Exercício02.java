package Aula05_Repeticao.Exercícios;

public class Exercício02 {
    public static void main(String[] args) {
        int pares = 0;
        int contador = 2;

        while (pares < 100){
            if (contador % 2 == 0);
            pares = contador + pares;
            contador += 2;

        }
        System.out.println(pares);
    }
}
