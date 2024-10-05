package aula02.exemplos;

public class Exemplo5_OperadorIncremento {
    public static void main(String[] args) {
        int num1 = 0;
        System.out.println("num1 = " + num1);

        num1++;
        System.out.println("num1 ++ = " + num1);

        num1 += 20;
        System.out.println("num1 += 20 = " + num1);

        num1 --;
        System.out.println("num1 -- = " + num1);

        num1 -= 5;
        System.out.println("num1 -= = " + num1);

        num1 *= 2;
        System.out.println("num1 *= = " + num1);

        num1 /= 2;
        System.out.println("num1 /= = " + num1);


        int num2 = 0;
        System.out.println("num2 = " + num2);
        num2 = num1++;
        System.out.println("antes num2 = num1++ depois num2 = " + num2 + " num1 = " + num1);

        num2 = ++num1;
        System.out.println("antes num2 = num1++ depois num2 = " + num2 + " num1 = " + num1);




    }
}
