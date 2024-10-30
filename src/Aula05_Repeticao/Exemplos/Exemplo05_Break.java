package Aula05_Repeticao.Exemplos;

public class Exemplo05_Break {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 5) { // se o programa encontrar o número 5, o break o encerra.
                break;
            }
            System.out.println(i);
        }
    }
}
