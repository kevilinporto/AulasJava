package Aula07_Funcoes.Exemplos;

public class Exemplo03 {
    public static void main(String[] args) {
        int retorno = funcaoComParametroComRetorno(2, 3); // o retorno acontece aqui, mas precisamos primeiro criar e atrbuir o resultado em uma variável
        System.out.println("O resultado é " + retorno);
    }// no private, apenas os elementos da classe poderão o enxergar
    private static int funcaoComParametroComRetorno(int number1, int number2){ //nas variáveis temos que especificar o tipo de cada parametro
        return number1 + number2;
    }
}
