package Aula02.exemplos;

public class Exemplo2 {
    public static void main(String[] args) {
        int total, numero1 = 2, numero2 = 4;

        total = numero1 + numero2;
        System.out.println("A soma dos números é = " + total);

        total = numero1 - numero2;
        System.out.println("A subtração dos números é = " + total);

        total = numero1 * numero2;
        System.out.println("A multiplicação dos número é = " + total);

        //o Java vai sempre priorizar o número maior (na memória) para fazer um cálculo. Ao realizar uma divisão, faça pelo menos um dos valores divididos um float.

        float totalFloat, numero1Float = 2;
        totalFloat = numero1Float / numero2;
        System.out.println("A divisão dos números é = " + totalFloat);

        float modulo = numero1Float % numero2;
        System.out.println("O resto da divisão de " + numero1Float + " por " + numero2 + " é igual a " + modulo);

    }
}
